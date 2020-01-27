FROM openjdk:8
COPY /target/spring-boot-cloud-stream-producer.jar spring-boot-cloud-stream-producer.jar
EXPOSE 9191
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","spring-boot-cloud-stream-producer.jar"]