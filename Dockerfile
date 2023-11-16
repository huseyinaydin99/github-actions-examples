FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-images-new.jar spring-boot-images-new.jar
ENTRYPOINT ["java","-jar","/spring-boot-images-new.jar"]