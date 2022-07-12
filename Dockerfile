FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} movies.jar
ENTRYPOINT ["java","-jar","/movies.jar"]