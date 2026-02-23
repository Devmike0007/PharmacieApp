# PharmacieApp

Application de gestion de pharmacie développée en Java avec une architecture structurée suivant le modèle MVC (Model - View - Controller partiel avec DAO). Cette application permet de gérer les médicaments, les opérations et les données de manière organisée et maintenable.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![MVC](https://img.shields.io/badge/Architecture-MVC-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-En%20développement-orange?style=for-the-badge)

---

## Structure du projet

Le projet est organisé comme suit :

```
PharmacieApp/
│
├── build/
├── nbproject/
├── src/
│   └── pharmacieapp/
│       ├── dao/
│       ├── model/
│       ├── util/
│       │   └── DatabaseConnection.java
│       ├── view/
│       ├── pharmacie.db        # Base SQLite (dans le dossier source selon la capture)
│       └── PharmacieApp.java
├── test/
├── .gitignore
├── build.xml
├── manifest.mf
├── README.md
├── sqlite-jdbc-3.51.2.0.jar
```

---

## Architecture utilisée

Le projet suit une architecture inspirée du modèle MVC :

- **Model** → contient les classes métier (ex : Medicament, Client, Vente, etc.)
- **View** → contient les interfaces utilisateur
- **DAO** → gère la communication avec la base de données
- **Util** → contient les outils utilitaires (ex : connexion SQLite)
- **Main** → point de démarrage de l'application

---

## Technologies utilisées

- Java
- Swing (interface graphique)
- NetBeans IDE
- JDBC (pour la base SQLite)
- Architecture MVC

---

## Base de données

Le projet utilise SQLite pour stocker les données.

- Fichier de base de données : `pharmacie.db` (par défaut à la racine du projet ; un exemplaire de test peut se trouver dans `src/pharmacieapp/` selon la configuration)
- Tables principales : `categorie_produit`, `client`, `utilisateur`, `type_produit`, `produit`, `vente`, `ligne_vente`, `facture`
- Dépendance JDBC : `sqlite-jdbc-3.51.2.0`

Ajouter la librairie :

- Manuellement : placer le JAR `sqlite-jdbc-3.51.2.0.jar` dans le dossier `lib/` et l'ajouter aux Libraries du projet NetBeans
- Avec Maven :

```xml
<dependency>
	<groupId>org.xerial</groupId>
	<artifactId>sqlite-jdbc</artifactId>
	<version>3.51.2.0</version>
</dependency>
```

Exemple de connexion JDBC :

```java
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

Connection connection = DatabaseConnection.getConnection();
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM utilisateur");
while(rs.next()) {
	System.out.println(rs.getString("nom") + " - " + rs.getString("user_name"));
}
rs.close();
stmt.close();
connection.close();
```

Remarque : SQLite n’utilise pas d’utilisateur ni de mot de passe par défaut.

---

## Fonctionnalités (actuelles ou prévues)

- Ajouter un médicament
- Modifier un médicament
- Supprimer un médicament
- Afficher la liste des médicaments
- Gestion du stock
- Interface graphique
- Connexion à la base de données SQLite
- Gestion des ventes et factures
- Gestion des utilisateurs

---

## Installation

1. Cloner le projet

```bash
git clone https://github.com/ton-username/PharmacieApp.git
cd PharmacieApp
```

2. Pré-requis

- Java JDK 11 ou supérieur
- NetBeans IDE (optionnel) ou tout autre IDE Java
- `sqlite-jdbc-3.51.2.0.jar` (placer dans `lib/` si vous n'utilisez pas Maven)

3. Ouvrir le projet

- Avec NetBeans : **File → Open Project** → sélectionner le dossier `PharmacieApp`
- Avec un IDE différent : importer le dossier `src/` comme projet Java

4. Ajouter la dépendance SQLite

- Méthode manuelle : copier `sqlite-jdbc-3.51.2.0.jar` dans `lib/` puis clic droit sur le projet → Properties → Libraries → Add JAR/Folder
- Avec Maven : ajouter la dépendance indiquée plus haut dans votre `pom.xml`

5. Lancer l'application

- Depuis NetBeans : exécuter la classe principale `pharmacieapp.PharmacieApp` (ou le fichier exécutable généré)
- Depuis la ligne de commande (si vous avez généré un JAR exécutable) :

```bash
java -jar PharmacieApp.jar
```

Exécution de test (optionnel) :

```java
// Exemple d'utilisation pour vérifier la connexion
Connection connection = DatabaseConnection.getConnection();
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM utilisateur");
while(rs.next()) {
	System.out.println(rs.getString("nom") + " - " + rs.getString("user_name"));
}
rs.close();
stmt.close();
connection.close();
```

Optionnel : utiliser `demo.Demo` pour tester la connexion et afficher les utilisateurs :

```java
Connection connection = DatabaseConnection.getConnection();
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM utilisateur");
while(rs.next()) {
	System.out.println(rs.getString("nom") + " - " + rs.getString("user_name"));
}
rs.close();
stmt.close();
connection.close();
```

---

## Auteur

**WASEKA Kibalikwa aron**
**KAYEMBE Nshimba michee**  
**MULUMBA Kalambayi yves**
**NGOY Marianah marie**
**Yango Ngolu grace**
Développeur Java  
Projet académique / personnel  

---

## Améliorations futures

- Ajout d'une base de données MySQL
- Ajout d'un système de login
- Gestion des ventes
- Gestion des utilisateurs
- Génération de rapports

---

## Licence

Projet libre pour usage éducatif et personnel.

---

## Guide d'utilisation rapide

- Ouvrir l'application → se connecter (si le module utilisateur est activé)
- Aller dans la section `Produits` pour ajouter/modifier/supprimer un produit
- Utiliser `Ventes` pour créer une vente et générer une facture

Note : l'interface est réalisée en Swing; adaptez la résolution si les formulaires ne s'affichent pas correctement.

---

## Changelog (exemple)

- 0.1.0 - Initialisation du projet, modèles, DAO basiques, vue Swing minimale

---

## Contribuer

Contributions bienvenues : ouvrez une issue pour discuter des changements, puis un pull request. Respectez le style Java et ajoutez des tests si nécessaire.

---

## Contact

Pour toute question, contactez les auteurs listés dans la section `Auteur`.
