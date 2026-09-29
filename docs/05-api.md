# Contrat de l'API REST

| Méthode | Route | Fonction |
|---|---|---|
| POST | /api/auth/register | Créer un compte |
| POST | /api/auth/login | Se connecter |
| GET | /api/transactions | Récupérer toutes les transactions de l'utilisateur |
| GET | /api/transactions/{id} | Récupérer une transaction |
| POST | /api/transactions | Ajouter une transaction |
| PUT | /api/transactions/{id} | Modifier une transaction |
| DELETE | /api/transactions/{id} | Supprimer une transaction |
| GET | /api/categories | Récupérer la liste des catégories |
| GET | /api/transactions?mois=&categorie= | Filtrer les transactions par mois et/ou catégorie |

Ces routes ne sont pas encore développées : ce document définit uniquement le contrat que l'application devra respecter.
