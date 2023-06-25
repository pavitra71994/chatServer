FROM openjdk:17
VOLUME /tmp
COPY target/*.jar chatApp-3.1.1..jar
ENTRYPOINT ["java","-jar","/chatApp-3.1.1.jar"]