# Architecture technique

## Frontend

Technologie : HTML / CSS / JavaScript

Pourquoi ce choix : rapide à mettre en place, aucune dépendance de build complexe, suffisant pour consommer une API REST et afficher les transactions et les graphiques.

## Backend

Technologie : Java avec Spring Boot

Pourquoi ce choix : cohérent avec la formation (Java, POO), Spring Boot est le standard pour exposer une API REST en Java, bien documenté, et très valorisé en entreprise.

## Base de données

Technologie : PostgreSQL, accès via JDBC

Pourquoi ce choix : robuste, gratuit, bien intégré à l'écosystème Java. JDBC plutôt qu'Hibernate pour rester rapide à mettre en place et garder un contrôle total du SQL, plus facile à expliquer à l'oral.

## Communication frontend/backend

Méthode : API REST / JSON (HTTP)

## Schéma d'architecture

```
┌──────────────┐
│  Frontend     │
│  HTML/CSS/JS  │
└──────┬────────┘
       │
       │ HTTP / JSON (REST)
       │
┌──────▼────────┐
│  Backend       │
│  Spring Boot   │
│  (Java)        │
└──────┬────────┘
       │
       │ SQL (JDBC)
       │
┌──────▼────────┐
│  PostgreSQL    │
└───────────────┘
```
