#FROM openjdk:11
#ADD target/docker-green-earth.jar docker-green-earth.jar
#ENTRYPOINT ["java","-jar","docker-green-earth.jar"]
FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} docker-green-earth.jar
ENTRYPOINT ["java", "-jar", "docker-green-earth.jar"]