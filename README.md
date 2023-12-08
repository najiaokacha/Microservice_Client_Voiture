# Microservice_Client_Voiture
# But du prpojet
Ce projet vise à plonger dans l'écosystème des architectures micro-services en se concentrant sur plusieurs axes essentiels. L'objectif est de créer et enregistrer des micro-services, d'établir une connexion avec une base de données MySQL, de mettre en place un micro-service Gateway, et de développer une communication synchrone entre ces micro-services en exploitant l'outil OPENFEIGN.

# Architecture adoptée
L'architecture adoptée se base sur des micro-services, décomposant l'application en entités autonomes interagissant pour offrir des fonctionnalités distinctes. Les micro-services clients jouent un rôle central en permettant une interaction fluide entre ces entités. L'API Gateway agit comme un point d'entrée centralisé, simplifiant la gestion des requêtes en dirigeant le trafic vers les micro-services appropriés. En parallèle, le serveur de découverte Eureka joue un rôle critique en permettant à chaque micro-service de s'enregistrer dynamiquement, créant ainsi un répertoire décentralisé des services disponibles.
archi

# Technologies utilisées
Ce projet exploite Spring Boot pour le développement du microservice, offrant ainsi une architecture simplifiée et efficace. La base de données MySQL est utilisée comme système relationnel pour stocker les informations relatives aux voitures et clients. Hibernate est intégré pour assurer la couche de persistance des données, facilitant ainsi la gestion et la manipulation des données dans le contexte de cette application basée sur les microservices.

# Création des microsevices
#  1) Eureka server
    
Eureka Server est un composant de Netflix OSS utilisé pour la découverte des services dans une architecture basée sur les microservices. Il agit comme un annuaire des différents services disponibles dans un environnement distribué. Les microservices s'enregistrent auprès du serveur Eureka, ce qui permet à d'autres services de les trouver et de communiquer avec eux de manière dynamique. Eureka simplifie la gestion des services en fournissant un mécanisme centralisé pour la localisation et la résolution des services dans un écosystème distribué.
![image](https://github.com/najiaokacha/Microservice_Client_Voiture/assets/100485014/47b51b57-821b-4cc7-ac93-5695405992cd)

#  2) Gateway
La conception d'une passerelle (Gateway) dans une architecture basée sur les microservices présente plusieurs objectifs et bénéfices. Cette passerelle agit comme le point d'entrée central pour l'ensemble du système. Plutôt que de disposer de multiples points d'entrée pour chaque microservice, la passerelle offre un point d'accès unique pour les clients et les utilisateurs finaux.Elle assure un routage dynamique des requêtes vers les divers microservices en fonction de critères tels que le chemin de l'URL, les en-têtes HTTP ou d'autres paramètres. Cette flexibilité permet une gestion efficace du trafic au sein du système.

#  3) Client
le microservice client est consulté pour fournir l'ensemble des clients ou un client en spécifiant son identifiant

#  4) Voiture
le microservice voiture fourni l'ensemble des voitures,les voitures d'un client ou voiture en spécifiant son identifiant

# Communication entre ces Microservices

Feign facilite la communication entre les microservices en simplifiant la création de clients HTTP déclaratifs. Voici comment cela fonctionne typiquement :

Création d'une Interface Feign : Vous définissez une interface dans le microservice appelant pour représenter les appels aux API du microservice cible. Cette interface utilise des annotations Feign pour définir les endpoints, les méthodes HTTP, et les paramètres.
Exécution des Requêtes : Lorsque vous appelez une méthode de l'interface Feign, le code correspondant à cette méthode est exécuté. Feign se charge de la création et de l'envoi de la requête HTTP au microservice cible, en utilisant les informations spécifiées dans l'interface (URL, paramètres, etc.).
Réception des Réponses : Une fois que la requête est exécutée, Feign traite la réponse HTTP retournée par le microservice cible et la renvoie à l'endroit où la méthode Feign a été invoquée. Cette réponse est alors utilisée par l'application appelante selon les besoins.
# 3) Etapes d'execution du projet
1) Cloner le référentiel depuis GitHub.

2) Configurer les bases de données dans les fichiers applications.properties de chaque microservice.

3) Exécutez tous les micro-service : Eureka server ,Gateway, Client et voiture
4) chercher un client un client


![image](https://github.com/najiaokacha/Microservice_Client_Voiture/assets/100485014/666e84b2-2b95-4fc0-8d2d-559964560f33)


5) chercer les voitures associées aux clients



![image](https://github.com/najiaokacha/Microservice_Client_Voiture/assets/100485014/94b3b12b-fcd7-4cbd-a7cb-8336c9c9aa61)
