FROM openjdk:17-jdk-alpine

ADD target/*.jar /opt/app.jar

EXPOSE 8090

CMD [ "java", "-jar", "/opt/app.jar"]