<h2>Spring Boot Event Driven Microservices RabbitMQ</h2>

Run below command to start all services
```
sh start.sh
```

Run below command to stop all services
```
sh stop.sh
```

Access RabbitMQ management UI. Default username/password : guest/guest
```
http://localhost:15672
```

Run CURL command to place an order for producer application
```
curl -X GET http://localhost:8080/orders/1000
```

After placing an order with producer application, view the logs for consumer
application. 
Below is the example of response in logs
```
Payment processing for order Id: 1000
```

#### Documentation:
1. [RabbitMQ](https://www.rabbitmq.com/getstarted.html)
2. [Spring Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/)
