FROM openjdk:17-oracle
VOLUME /tmp
EXPOSE 8090
ADD target/homeWorkDiplom-0.0.1-SNAPSHOT.jar homeWorkDiplom.jar
ENTRYPOINT ["java", "-jar", "/homeWorkDiplom.jar"]