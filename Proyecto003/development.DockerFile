FROM java:8
EXPOSE 8080
ADD /target/firstRestDocker-0.0.1-SNAPSHOT.jar firstRestDocker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "firstRestDocker-0.0.1-SNAPSHOT.jar"]