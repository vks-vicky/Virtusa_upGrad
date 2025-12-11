# S1: Base Image
FROM eclipse-temurin:17-jdk

# S2: Working directory
WORKDIR /app

# S3: Copy JAR
COPY target/DockerSB-0.0.1-SNAPSHOT.jar app.jar

# S4: Expose port
EXPOSE 8080

# S5: Run application/command
ENTRYPOINT ["java", "-jar", "app.jar"]