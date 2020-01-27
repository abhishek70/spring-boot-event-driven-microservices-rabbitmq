FROM openjdk:8
COPY /target/spring-boot-cloud-stream-consumer.jar spring-boot-cloud-stream-consumer.jar
EXPOSE 9191
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-cloud-stream-consumer.jar"]