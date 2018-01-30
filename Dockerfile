#Base Apline Linux based image with OpenJDK JRE only
FROM openjdk:8-jre-alpine
#Copy application JAR (with libraries inside)
COPY target/Mini*.jar /app.jar
CMD ["/usr/bin/java", "-jar", "/app.jar"]
