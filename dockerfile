FROM openjdk:8
MAINTAINER wlf
EXPOSE 8081
COPY ./target/sample1.jar app.jar
CMD ["java","-jar","app.jar"]
