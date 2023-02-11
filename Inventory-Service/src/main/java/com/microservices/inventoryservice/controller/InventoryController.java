package com.microservices.inventoryservice.controller;

import com.microservices.inventoryservice.model.Inventory;
import com.microservices.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@PathVariable("sku-code") String skuCode){
        return this.inventoryService.isInStock(skuCode);
    }

    @GetMapping()
    public List<Inventory> getAllInventoryItems(){
        return this.inventoryService.getAllInventoryItems();
    }

}
