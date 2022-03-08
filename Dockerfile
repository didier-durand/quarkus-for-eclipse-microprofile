FROM maven:3.8.3-openjdk-11 as builder
WORKDIR /app
COPY pom.xml .
COPY src/ ./src/
#RUN mvn package
# see https://quarkus.io/guides/building-native-image
RUN mvn package package -Pnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true
