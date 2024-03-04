
FROM eclipse-temurin:17-jdk

COPY target/gateway-0.0.1-SNAPSHOT.jar /gatewayService.jar

ENV PORT=8762
EXPOSE 8762

CMD ["java", "-jar","/gatewayService.jar"]