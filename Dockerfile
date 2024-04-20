FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/indicai-1.0.0.jar indicai-1.0.0.jar
EXPOSE 25000
CMD ["java", "-jar", "indicai-1.0.0.jar"]