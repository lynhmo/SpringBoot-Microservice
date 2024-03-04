#FROM eclipse-temurin:17-jdk
#
#WORKDIR /app
#
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#
#COPY src ./src
#ENV PORT=8200
#EXPOSE 8200
#
#CMD ["./mvnw", "spring-boot:run"]

FROM eclipse-temurin:17-jdk

COPY target/ImageService-0.0.1-SNAPSHOT.jar /imageService.jar

ENV PORT=8200
EXPOSE 8200

CMD ["java", "-jar","/imageService.jar"]