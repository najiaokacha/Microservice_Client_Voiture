# Microservice_Client_Voiture
# But du prpojet
Ce projet vise à plonger dans l'écosystème des architectures micro-services en se concentrant sur plusieurs axes essentiels. L'objectif est de créer et enregistrer des micro-services, d'établir une connexion avec une base de données MySQL, de mettre en place un micro-service Gateway, et de développer une communication synchrone entre ces micro-services en exploitant l'outil OPENFEIGN.

# Architecture adoptée
L'architecture adoptée se base sur des micro-services, décomposant l'application en entités autonomes interagissant pour offrir des fonctionnalités distinctes. Les micro-services clients jouent un rôle central en permettant une interaction fluide entre ces entités. L'API Gateway agit comme un point d'entrée centralisé, simplifiant la gestion des requêtes en dirigeant le trafic vers les micro-services appropriés. En parallèle, le serveur de découverte Eureka joue un rôle critique en permettant à chaque micro-service de s'enregistrer dynamiquement, créant ainsi un répertoire décentralisé des services disponibles.
archi

# Technologies utilisées
Ce projet exploite Spring Boot pour le développement du microservice, offrant ainsi une architecture simplifiée et efficace. La base de données MySQL est utilisée comme système relationnel pour stocker les informations relatives aux voitures et clients. Hibernate est intégré pour assurer la couche de persistance des données, facilitant ainsi la gestion et la manipulation des données dans le contexte de cette application basée sur les microservices.

#Création des microsevices
  #  1) Eureka server
    
Eureka Server est un composant de Netflix OSS utilisé pour la découverte des services dans une architecture basée sur les microservices. Il agit comme un annuaire des différents services disponibles dans un environnement distribué. Les microservices s'enregistrent auprès du serveur Eureka, ce qui permet à d'autres services de les trouver et de communiquer avec eux de manière dynamique. Eureka simplifie la gestion des services en fournissant un mécanisme centralisé pour la localisation et la résolution des services dans un écosystème distribué.
![image](https://github.com/najiaokacha/Microservice_Client_Voiture/assets/100485014/47b51b57-821b-4cc7-ac93-5695405992cd)


