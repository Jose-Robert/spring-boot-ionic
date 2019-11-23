FROM openjdk:12

ENV TZ America/Recife

MAINTAINER José Robert

VOLUME [ "/var/lib/docker/volumes/cursomc" ]

COPY /target/cursomc-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]