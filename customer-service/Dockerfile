FROM openjdk:23
WORKDIR /app
COPY target/customer-service.jar customer-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","customer-service.jar"]