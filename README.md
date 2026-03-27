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
**Tests dans Postman avec JWT et Authorisations**

## Authentification en tant qu'Admin
<img width="962" height="866" alt="image" src="https://github.com/user-attachments/assets/6babeac7-da2d-4f67-8ae5-ac1cc8eaf06b" />

## Page d'accès publique
<img width="966" height="746" alt="image" src="https://github.com/user-attachments/assets/93991408-6589-4725-ab52-26c3e91469e3" />

## Accès à la page des Admins
<img width="964" height="845" alt="image" src="https://github.com/user-attachments/assets/16ad5d15-656d-4995-9b4c-03b1a1606914" />

## Authentification en tant qu'Utilisateur (pas Admin)
<img width="954" height="850" alt="image" src="https://github.com/user-attachments/assets/b56000d2-64f0-45c4-b4b0-cc44ec06182e" />

## Page d'accès publique
<img width="963" height="715" alt="image" src="https://github.com/user-attachments/assets/a94a5601-c1c5-4d5a-bec8-1803f072df07" />

## Accès à la page des Admins (refusée)
<img width="964" height="723" alt="image" src="https://github.com/user-attachments/assets/99641008-4159-4b3c-ba3e-9e0f9db437ec" />

