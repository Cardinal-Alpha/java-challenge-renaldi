FROM openjdk:11
WORKDIR /application
COPY pom.xml .
COPY src/ src/
COPY .mvn/ .mvn/
COPY mvnw .
RUN ./mvnw -DskipTests=true install
CMD java -jar target/renaldi-0.0.1-SNAPSHOT.jar
