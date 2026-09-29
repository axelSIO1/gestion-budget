# Modèle Logique de Données (MLD)

## Entités identifiées (avant le MCD)

UTILISATEUR
id
nom
email
mot de passe

CATEGORIE
id
nom (ex : loyer, alimentation, loisirs, transport, salaire, bourse...)
type (dépense / revenu)

TRANSACTION
id
montant
date
description
type (dépense / revenu)

## Relations

- Un utilisateur possède plusieurs transactions ; une transaction appartient à un seul utilisateur.
- Une catégorie classe plusieurs transactions ; une transaction appartient à une seule catégorie.

## MLD

UTILISATEUR
-----------
id_utilisateur PK
nom
email
mot_passe

CATEGORIE
---------
id_categorie PK
nom
type

TRANSACTION
-----------
id_transaction PK
montant
date
description
type
id_utilisateur FK
id_categorie FK

## Tables de la base de données

Ma base de données contiendra 3 tables : UTILISATEUR, CATEGORIE, TRANSACTION.
