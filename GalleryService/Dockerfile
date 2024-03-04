FROM eclipse-temurin:17-jdk

COPY target/GalleryService-0.0.1-SNAPSHOT.jar /galleryService.jar

ENV PORT=8100
EXPOSE 8100

CMD ["java", "-jar","/galleryService.jar"]