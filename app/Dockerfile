FROM maven AS build
WORKDIR /app
COPY . .
RUN mvn install -DskipTests=false

FROM openjdk:8-jre-alpine

WORKDIR /swagger-petstore

COPY --from=build /app/target/lib/jetty-runner.jar /swagger-petstore/jetty-runner.jar
COPY --from=build /app/target/*.war /swagger-petstore/server.war
COPY --from=build /app/src/main/resources/openapi.yaml /swagger-petstore/openapi.yaml
COPY --from=build /app/inflector.yaml /swagger-petstore/

EXPOSE 8080

CMD ["java", "-jar", "-DswaggerUrl=openapi.yaml", "/swagger-petstore/jetty-runner.jar", "--log", "/var/log/yyyy_mm_dd-requests.log", "/swagger-petstore/server.war"]
