FROM openjdk:17
ARG JAR_FILE=target/*jar
ADD ./target/chatApp-3.1.1..jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]