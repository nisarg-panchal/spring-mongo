FROM amazoncorretto:22
RUN mkdir "/home/app"
WORKDIR "/home/app"
EXPOSE 8080
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]