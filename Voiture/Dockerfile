# Utiliser une image de base compatible Java
FROM openjdk:17-oracle
VOLUME /tmp
# Copier les fichiers de l'application
COPY target/Voiture-0.0.1-SNAPSHOT.jar app.jar
# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "app.jar"]