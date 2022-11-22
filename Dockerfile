FROM    openjdk
WORKDIR usr/lib
ADD ./target/s1_practice-0.0.1-SNAPSHOT.jar /usr/lib/s1_practice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","s1_practice-0.0.1-SNAPSHOT.jar"]