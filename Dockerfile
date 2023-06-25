FROM openjdk:17
ARG JAR_FILE=target/*jar
ADD target/chatserver.jar chatserver.jar
ENTRYPOINT ["java","-jar","/chatserver.jar"]