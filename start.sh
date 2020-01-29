#!/usr/bin/env bash

mvn clean install -DskipTests
docker network rm spring-boot-rabbitmq
docker network create spring-boot-rabbitmq
docker-compose up -d
docker logs -f message-consumer