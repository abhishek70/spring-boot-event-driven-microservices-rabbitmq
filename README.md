<h2>Spring Boot Event Driven Microservices RabbitMQ</h2>

Run the following command from the root directory to generate .jar for all your services.
```
mvn clean install
```


Run the following command from the root directory to create network and start docker containers.
```
docker network create spring-boot-rabbitmq
docker-compose up -d
```