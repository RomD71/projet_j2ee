package com.jee.bdd;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class testJDBC {

    /* La liste qui contiendra tous les résultats de nos essais */

    private List<String> messages = new ArrayList<String>();


    public List<String> executerTests( HttpServletRequest request ) {

        try {
            messages.add( "Chargement du driver..." );
            Class.forName( "com.mysql.jdbc.Driver" );
            messages.add( "Driver chargé !" );
        } catch ( ClassNotFoundException e ) {
            messages.add( "Erreur lors du chargement : le driver n'a pas été trouvé dans le classpath ! <br/>"
                    + e.getMessage() );
        }

    /* Connexion à la base de données */
        String url = "jdbc:mysql://localhost:3306/projet_j2ee";
        String utilisateur = "root";
        String motDePasse = "";
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;
        try {
            messages.add( "Connexion à la base de données..." );
            connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
            messages.add( "Connexion réussie !" );

        /* Création de l'objet gérant les requêtes */

            statement = connexion.createStatement();
            messages.add( "Objet requête créé !" );

        /* Exécution d'une requête de lecture */

            resultat = statement.executeQuery( "SELECT nom_championnat, pays FROM championnat;" );
            messages.add( "Requête \"SELECT id, email, mot_de_passe, nom FROM Utilisateur;\" effectuée !" );

        /* Récupération des données du résultat de la requête de lecture */

            while ( resultat.next() ) {
               // int idUtilisateur = resultat.getInt( "id" );
                String nomChamp = resultat.getString( "nom_championnat" );
                String pays = resultat.getString( "pays" );
                //String nomUtilisateur = resultat.getString( "nom" );

            /* Formatage des données pour affichage dans la JSP finale. */

                messages.add( "Données retournées par la requête : Nom Championnat = " + nomChamp
                        + ", Pays = "
                        + pays + "." );
            }

        } catch ( SQLException e ) {

            messages.add( "Erreur lors de la connexion : <br/>"
                    + e.getMessage() );

        } finally {

            messages.add("Fermeture de l'objet ResultSet.");

            if (resultat != null) {
                try {
                    resultat.close();
                } catch (SQLException ignore) {
                }
            }

            messages.add("Fermeture de l'objet Statement.");

            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            }

            messages.add("Fermeture de l'objet Connection.");

            if (connexion != null) {
                try {
                    connexion.close();
                } catch (SQLException ignore) {
                }
            }
        }
        return messages;

    }

}