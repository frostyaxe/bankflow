FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY bankflow/target/bankflow-*.jar app.jar
RUN chmod +x app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]