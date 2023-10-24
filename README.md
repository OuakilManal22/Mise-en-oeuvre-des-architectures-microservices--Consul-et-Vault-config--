# Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config-
La configuration des microservices englobe la manière dont les paramètres et les valeurs sont définis, stockés, distribués et mis à jour au sein de l'ensemble du système de microservices. Une gestion de configuration appropriée permet de garantir la scalabilité, la flexibilité et la maintenabilité de l'architecture des microservices. Elle peut inclure la gestion des propriétés, la gestion des secrets, la distribution des configurations, et l'automatisation des mises à jour, autant d'aspects fondamentaux pour le succès des microservices.
Durant cette activité pratique, nous explorerons la configuration pour une architecture distribuée desmicroservices en utilisant consul config et Vault config.
Consul Config (avec Consul Service Discovery) :
Consul est une solution polyvalente qui peut être utilisée pour gérer la configuration, la découverte de services et la gestion des secrets, offrant ainsi une solution complète pour les besoins d'infrastructure des microservices. C'est un outil développé par HashiCorp qui offre des fonctionnalités de découverte de services, de gestion de la configuration et de gestion des secrets pour les environnements distribués. Dans le contexte de la gestion de la configuration, Consul permet de stocker des configurations dans son stockage de clés-valeurs et de les mettre à disposition des microservices.
La combinaison de Consul Config avec Consul Service Discovery permet aux microservices de découvrir dynamiquement les configurations des autres services, ce qui facilite la gestion des configurations dans un environnement distribué.

![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/30da6ae1-8455-4b44-9f9e-7f4d69ddd265)

Le dossier "Key/Value" dans l'interface de Consul fait référence à l'interface de gestion de la configuration de Consul. Dans Consul, nous avons la possibilité de stocker des paires clé/valeur (key/value) qui peuvent être utilisées pour stocker diverses informations de configuration, des paramètres d'application aux valeurs de configuration système. 

![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/d2463289-eaf6-4db5-92ee-eb7183d79a89)

![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/6ac1c514-d879-43dd-a80d-49277b76747f)

La classe MyConsulConfig est un composant Spring géré, configuré pour lier des propriétés de configuration avec un préfixe "token". Les valeurs de configuration commençant par "token" dans le fichier de configuration seront automatiquement assignées aux champs de cette classe, facilitant ainsi la gestion des paramètres de configuration dans une application Spring Boot.

                                                                  **************************************

Vault (Vault Config) :
Vault est un outil de gestion des secrets et de la sécurité également développé par HashiCorp. Il peut également être utilisé pour stocker des configurations sensibles de manière sécurisée. Vault est particulièrement adapté à la gestion de configurations sensibles, telles que les clés d'API, les certificats, les mots de passe, etc. Il offre un stockage sécurisé des configurations et un contrôle d'accès précis.
- Démarrage Vault:
  ![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/f2ea1e8a-0e68-4168-8646-055c891ed7f1)
- Création des clés valeurs:
  ![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/f177ea39-2ba0-48b6-ae0d-dcbfdd5b3d81)

![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/b399cd06-7896-48d7-b6fc-5e8ab31a4830)

La classe MyVaultConfig est un composant Spring géré, configuré pour lier des propriétés de configuration avec un préfixe "user". Les valeurs de configuration commençant par "user" dans le fichier de configuration seront automatiquement assignées aux champs de cette classe, ce qui facilite la gestion des paramètres de configuration dans une application Spring Boot.

![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/d40c21b9-eae8-47b3-9d30-49efea5d2858)

Ce contrôleur REST expose un endpoint /myConfig qui renvoie des données de configuration en réponse à une requête GET. Ces données proviennent des objets myConsulConfig et myVaultConfig, qui sont injectés dans le contrôleur à l'aide de l'annotation @Autowired.

![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/701d22bd-2015-4bf1-9872-feeb112a7b61)

- Créer des clés valeurs à partie du micro service à l'aide du Vault Template:
  
  ![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/2f751b76-6c75-42c2-858b-8e5195ca78b8)

![image](https://github.com/OuakilManal22/Mise-en-oeuvre-des-architectures-microservices--Consul-et-Vault-config--/assets/105586177/ffbcc2ed-60d8-40b9-80cd-e77c564fe44a)


Eureka Discovery et Consul, quelle différence?

Eureka Discovery Server, faisant partie de Spring Cloud, est spécifiquement conçu pour les applications basées sur Spring Boot. Il permet aux microservices de s'enregistrer et de se découvrir mutuellement. En revanche, Consul est une solution plus polyvalente qui peut être utilisée dans des environnements divers, indépendamment du langage de programmation. Il offre des fonctionnalités avancées, notamment la découverte de services, la gestion de la configuration et de la sécurité, ce qui en fait un choix plus flexible pour les architectures de microservices hétérogènes
Le choix entre Spring Cloud Config, Consul Config et Vault Config dépendra des besoins spécifiques en matière de gestion de la configuration et de sécurité. L'intérêt de créer des fichiers de configuration séparés pour chaque microservice réside dans la modularité, la maintenance facilitée et l'indépendance du développement. 

