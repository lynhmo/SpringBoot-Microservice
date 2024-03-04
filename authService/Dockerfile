FROM eclipse-temurin:17-jdk

COPY target/authService-0.0.1-SNAPSHOT.jar /authService.jar

ENV PORT=9100
EXPOSE 9100

CMD ["java", "-jar","/authService.jar"]
