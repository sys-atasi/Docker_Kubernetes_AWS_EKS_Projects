FROM openjdk:23
WORKDIR /app
COPY target/product-service.jar product-service.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","product-service.jar" ]