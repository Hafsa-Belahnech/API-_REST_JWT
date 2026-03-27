# TP 12 : Sécurisation d'une API REST avec Spring Security et JWT
Ce projet pratique porte sur l'implémentation d'une architecture de sécurité **Stateless** (sans état) pour une API REST, en utilisant **Spring Security** et les jetons **JWT** (JSON Web Tokens).

## Objectifs
*   **Authentification REST** : Création d'un point d'accès (`/login`) capable de vérifier les identifiants et de générer un jeton JWT signé.
*   **Filtres d'Autorisation** : Mise en place d'un filtre personnalisé (`Filter Chain`) pour intercepter, extraire et valider le jeton JWT à chaque requête.
*   **Architecture Stateless** : Configuration de Spring Security pour fonctionner sans session (`SessionCreationPolicy.STATELESS`).
*   **Gestion des Rôles** : Sécurisation fine des points d'accès de l'API selon les rôles et permissions des utilisateurs.

## Outils et Technologies utilisé
- IntelliJ, Maven, JDK +17
- Dépendances : Spring Boot 3+, Spring Security 6, Spring Web, Spring Data JPA, MySQL Driver, Lombok, jjwt (JSON Web Token library)


## Étapes de Réalisation

1.  **Initialisation** : Configuration des dépendances (Spring Security, JJWT).
2.  **Modélisation** : Création des entités Utilisateurs et Rôles avec JPA.
3.  **Logique JWT** : Développement de l'utilitaire pour la génération et la validation des signatures.
4.  **Filtre de Sécurité** : Implémentation du filtre d'interception des requêtes.
5.  **Configuration** : Paramétrage de la `SecurityFilterChain` pour autoriser/restreindre les accès.
6.  **Tests Postman** : Validation du flux d'authentification et accès aux ressources protégées.


## Captures d'écran 
