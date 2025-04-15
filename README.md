# 🧩 Spring Boot Microservices - Docker Setup

This project contains two Spring Boot microservices:

- `customer-service`
- `product-service`
Each service is containerized using Docker

---
## 🐳 Dockerfile 

### customer-service/Dockerfile
![Screenshot 2025-04-14 164940](https://github.com/user-attachments/assets/3c215d3b-977d-4172-8138-74d70911cfaf)

### product-service/dockerfile
![Screenshot 2025-04-14 165013](https://github.com/user-attachments/assets/edcdbb70-da4e-45ec-a0a2-73929e819064)

##  Building Docker Images

### Build for customer-service
cd customer-service <br>
docker build -t customer-service .

### Build for product-service
cd product-service <br>
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

docker stop customer-service <br>
docker stop product-service <br>
docker rm customer-service <br>
docker rm product-service

# 🧩 Spring Boot Microservices - Docker + Kubernetes + Minikube

This project contains two microservices built using Spring Boot:

- `customer-service`
- `product-service`

Each service is containerized with Docker and deployed to a **local Kubernetes cluster using Minikube**.

---

## 🐳 Dockerization

### 📄 Dockerfile (for both services)(Already done above)

## 💻 Using Minikube for Local Kubernetes

### Start Minikube

## minikube start 

for customer-service
![customer-service-minikubestart](https://github.com/user-attachments/assets/9e99d344-59f1-4e09-b612-96031159801f)

for product-service
![product-service-minikubestart](https://github.com/user-attachments/assets/89184652-b9a6-4fdf-9f25-61e162a50adb)

## minikube status
for customer-service
![customer-service-minikubestatus](https://github.com/user-attachments/assets/20298b99-956f-427a-98f8-1bb7e99de6c3)

for product-service
![product-service-minikubestatus](https://github.com/user-attachments/assets/73fe0bad-2388-44a1-92a5-3aeee4c2f67b)

##☸️ Kubernetes Deployment
### Customer-service-deployment.yaml
![customer-service-deployment](https://github.com/user-attachments/assets/21c8e350-4f26-41fa-9aeb-9f50d952a1d3)

### Customer-service-service.yaml
![customer-service-service](https://github.com/user-attachments/assets/c1821100-9214-423a-93ae-a65c897eac5d)

### Product-service-deployment.yaml
![product-service-deployment](https://github.com/user-attachments/assets/8afc9d74-8b43-44cd-b18b-70421cfb9424)

### product-service-service.yaml
![docker-file-product-service](https://github.com/user-attachments/assets/0bfbafd8-84d8-47fa-b0a9-5996335305dc)

## 🚀 Deploy to Minikube
![kubernets-apply-deployment](https://github.com/user-attachments/assets/f01b1cd8-6ce4-470c-91d4-6c040e524c21)

## minikube dashboard
![Screenshot 2025-04-14 164702](https://github.com/user-attachments/assets/6849654d-82db-42f6-9932-6fef4c510119)

![Screenshot 2025-04-14 164713](https://github.com/user-attachments/assets/9094fa59-2a8f-4036-bcb7-e8ce882f7d70)

![Screenshot 2025-04-14 164721](https://github.com/user-attachments/assets/1b5babe2-bc66-4f07-aec9-4b910e2f3ff9)


## ✅ Deploy customer-service:
kubectl apply -f k8s/customer-service-deployment.yaml <br>
kubectl apply -f k8s/customer-service-service.yaml

## ✅ Deploy product-service:
kubectl apply -f k8s/product-service-deployment.yaml <br>
kubectl apply -f k8s/product-service-service.yaml

### To check the status: 

kubectl get pods <br>
kubectl get services
![Screenshot 2025-04-14 120733](https://github.com/user-attachments/assets/c93b1c17-1448-4f81-b8f1-cde0754764f0)

![Screenshot 2025-04-14 120749](https://github.com/user-attachments/assets/8dea0495-da2f-48b3-b3ce-80dd27f2207e)


### minikube service
## for customer-service
![Screenshot 2025-04-14 170326](https://github.com/user-attachments/assets/0b4559e3-3ef3-4aaf-815f-5639d6081ca2)

## for product-service
![Screenshot 2025-04-14 170539](https://github.com/user-attachments/assets/0f0ab48c-dcda-45b1-ac10-fa4aba04754b)


### Running
## for products-service
![Screenshot 2025-04-14 170530](https://github.com/user-attachments/assets/62f4a7eb-84d8-47be-b578-7bc9d79c921a)

## for customer-service
![Screenshot 2025-04-14 170315](https://github.com/user-attachments/assets/a319fe6b-cca1-47aa-9899-70de0f910f5b)
























