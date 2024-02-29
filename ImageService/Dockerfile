FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
ENV PORT=8200
EXPOSE 8200

CMD ["./mvnw", "spring-boot:run"]