FROM openjdk:17
ADD ./out/production/ChatAppApplication/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java","ChatAppApplication"]