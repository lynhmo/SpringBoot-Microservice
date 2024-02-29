FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
ENV PORT=8761
EXPOSE 8761

CMD ["./mvnw", "spring-boot:run"]