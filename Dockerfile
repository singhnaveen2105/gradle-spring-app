FROM openjdk:17-jdk-slim-buster
EXPOSE 8080
ADD build/libs/gradle-spring-app.jar gradle-spring-app.jar
ENTRYPOINT ["java","-jar","/gradle-spring-app.jar"]
