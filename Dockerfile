FROM jelastic/maven:3.9.4-openjdk-22.ea-b17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn clean install -DskipTests

FROM openjdk:22-jdk
WORKDIR /app
COPY --from=build /root/.m2/repository/com/example/demo/0.0.1-SNAPSHOT/demo-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]