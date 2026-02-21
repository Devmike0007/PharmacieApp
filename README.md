# PharmacieApp

Application de gestion de pharmacie développée en Java avec une architecture structurée suivant le modèle MVC (Model - View - Controller partiel avec DAO). Cette application permet de gérer les médicaments, les opérations et les données de manière organisée et maintenable.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![MVC](https://img.shields.io/badge/Architecture-MVC-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-En%20développement-orange?style=for-the-badge)

---

# Structure du projet

Le projet est organisé comme suit :

```
PharmacieApp/
│
├── src/
│   └── pharmacieapp/
│       ├── dao/        # Accès aux données (Database Access Object)
│       ├── model/      # Classes représentant les entités métier
│       ├── view/       # Interfaces utilisateur (Swing / GUI)
│       ├── util/       # Classes utilitaires (connexion, helpers, etc.)
│       └── PharmacieApp.java   # Classe principale (point d'entrée)
│
├── build/              # Fichiers compilés
├── test/               # Tests
├── nbproject/          # Configuration NetBeans
├── manifest.mf        # Fichier manifest
```

---

# Architecture utilisée

Le projet suit une architecture inspirée du modèle MVC :

- **Model** → contient les classes métier (ex : Medicament, Client, Vente, etc.)
- **View** → contient les interfaces utilisateur
- **DAO** → gère la communication avec la base de données
- **Util** → contient les outils utilitaires
- **Main** → point de démarrage de l'application

---

# Technologies utilisées

- Java
- Swing (interface graphique)
- NetBeans IDE
- JDBC (pour la base de données)
- Architecture MVC

---

# Fonctionnalités (actuelles ou prévues)

- Ajouter un médicament
- Modifier un médicament
- Supprimer un médicament
- Afficher la liste des médicaments
- Gestion du stock
- Interface graphique
- Connexion à une base de données

---

# Installation

## 1. Cloner le projet

```bash
git clone https://github.com/ton-username/PharmacieApp.git
```

## 2. Ouvrir avec NetBeans

- Ouvrir NetBeans
- Cliquer sur **File → Open Project**
- Sélectionner le dossier **PharmacieApp**

## 3. Exécuter le projet

Lancer la classe :

```
PharmacieApp.java
```

---

# Auteur

**Miche Kayembe**  
**MULUMBA KALAMBAYI YVES**
Développeur Java  
Projet académique / personnel  

---

# Améliorations futures

- Ajout d'une base de données MySQL
- Ajout d'un système de login
- Gestion des ventes
- Gestion des utilisateurs
- Génération de rapports

---

# Licence

Projet libre pour usage éducatif et personnel.
