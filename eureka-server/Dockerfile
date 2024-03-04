FROM eclipse-temurin:17-jdk

COPY target/eureka-server-0.0.1-SNAPSHOT.jar /eurekaServer.jar

ENV PORT=8761
EXPOSE 8761

CMD ["java", "-jar","/eurekaServer.jar"]