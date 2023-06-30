FROM eclipse-temurin:20-jdk-alpine
COPY build/libs/*.jar app.jar
EXPOSE 80 443
ENTRYPOINT ["java","-jar","/app.jar"]