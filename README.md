# Spring Boot Microservice with Docker

This project demonstrates how to containerize a Spring Boot microservice application using Docker, enabling seamless deployment and scalability.

# Project Overview

ecom/
├── src/
│   └── main/
│       └── java/
│        
│
├── Dockerfile
├── pom.xml
└── README.md

# Dockerizing the Application(Customer-Service)
Create a Dockerfile in the root of your project:

//code
FROM openjdk:23
WORKDIR /app
COPY target/customer-service.jar customer-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","customer-service.jar"]

# Dockerizing the Application(Product-Service)

//code
FROM openjdk:23
WORKDIR /app
COPY target/product-service.jar product-service.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","product-service.jar" ]

# Build Docker Image
for Customer Service:-
✅ 1. Build your Docker image
docker build -t customer-service .
This creates a Docker image named customer-service.

for Product-Service:-
✅ 2. Build your Docker image
docker build -t product-service .
This creates a Docker image named product-service.

✅ 3. Run the Docker container
docker run -p 9010:6655 customer-service
docker run -p 9011:5566 product-service

🧪 Then test:
for customer-service:-
http://localhost:9010/api/customers
for product-service:-
http://localhost:9011/api/products
