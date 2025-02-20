FROM amazoncorretto:22
WORKDIR app
EXPOSE 8080
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]