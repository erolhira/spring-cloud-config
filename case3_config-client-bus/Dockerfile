FROM java:8-jdk-alpine
COPY ./target/case3-config-client-bus-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "case3-config-client-bus-0.0.1-SNAPSHOT.jar"]