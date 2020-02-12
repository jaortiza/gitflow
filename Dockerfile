FROM openjdk:8-jdk-alpine
COPY ./target/*.jar client.jar
EXPOSE 8080
CMD ["java","-jar","client.jar"]
