FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD user-0.0.1-SNAPSHOT.jar user.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/user.jar"]