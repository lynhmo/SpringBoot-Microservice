FROM openjdk:17-oracle

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src
ENV PORT=8100
EXPOSE 8100

CMD ["./mvnw", "spring-boot:run"]