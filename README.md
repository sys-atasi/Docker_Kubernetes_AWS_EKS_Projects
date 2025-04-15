# Spring Boot Microservices - Docker Setup

This project contains two Spring Boot microservices:

- `customer-service`
- `product-service`
Each service is containerized using Docker

---
##  Dockerfile 

### customer-service/Dockerfile
![Screenshot 2025-04-14 164940](https://github.com/user-attachments/assets/3c215d3b-977d-4172-8138-74d70911cfaf)

### product-service/dockerfile
![Screenshot 2025-04-14 165013](https://github.com/user-attachments/assets/edcdbb70-da4e-45ec-a0a2-73929e819064)

##  Building Docker Images

### Build for customer-service
cd customer-service
docker build -t customer-service .

### Build for product-service
cd product-service
docker build -t product-service .

## Running Containers Individually
### customer-service
![Screenshot 2025-04-14 165424](https://github.com/user-attachments/assets/ed46e5ee-abbc-432f-9f7e-3b7797dee1b9)

### product-service
![Screenshot 2025-04-14 165643](https://github.com/user-attachments/assets/e960416e-5019-49f7-b576-44f326a604ef)

## Testing
### customer-service
![Screenshot 2025-04-14 165447](https://github.com/user-attachments/assets/319a123a-7dd9-49e5-a5d8-4f3c37550afe)
### product-service
![Screenshot 2025-04-14 165651](https://github.com/user-attachments/assets/3bcaaafb-35b0-4d8f-bbab-6698e14d5537)

### Stopping & Cleaning Up

docker stop customer-service 
docker stop product-service
docker rm customer-service
docker rm product-service








