FROM maven:3.8.5-openjdk-17 AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:17

#maintainer
MAINTAINER pavitrank1@gmail.com
#expose port 8080
EXPOSE 8080

#default command
CMD java -jar /data/chatserver.jar

#copy hello world to docker image from builder image

COPY --from=maven_build /tmp/target/chatserver.jar /data/chatserver.jar