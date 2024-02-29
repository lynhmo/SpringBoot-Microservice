FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
ENV PORT=9100
EXPOSE 9100

CMD ["./mvnw", "spring-boot:run"]