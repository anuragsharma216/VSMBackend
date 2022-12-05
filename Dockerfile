FROM openjdk:8
EXPOSE 8081
ADD target/VMS-integration.jar VMS-integration.jar
ENTRYPOINT ["java","-jar","/VMS-integration.jar"}