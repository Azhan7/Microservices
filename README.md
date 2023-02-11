# MicroServices


## 1. Project Introduction
This is the project to learn the microservices architecture. Now a days, microservices are being used to scale the system. As application continues to grow, breaking monolith code into microservices becomes inevitable. In this project i am trying to learn how to divide monolith application into microservies.


## 2.  Project Architecture 
![image](https://user-images.githubusercontent.com/50276587/218269451-938c9fc3-adf8-4ccd-a3aa-16fb6c223bfb.png)

### 2.1 Services Details:
#### 2.1.1 Product Service:
The Product Service is used to handle all the operations related to the products. Users can add, delete, update, and get products by communicating with Product Service.

#### 2.1.2 Orders Service:
The Order Service is used to handle all the operations related to the orders. When a user place any order, it is directed towards Order Service.

#### 2.1.3 Inventory Service:
The Inventory Service is used to check whether the requested product is available in the inventory or not.
