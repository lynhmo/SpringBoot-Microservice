FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
ENV PORT=8762
EXPOSE 8762

CMD ["./mvnw", "spring-boot:run"]