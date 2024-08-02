FROM openjdk:17
EXPOSE 8080
ADD build/libs/my-gradle-project.jar my-gradle-project.jar
ENTRYPOINT ["java","-jar","/my-gradle-project.jar"]