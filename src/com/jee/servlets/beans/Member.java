package com.jee.servlets.beans;

import sun.security.util.Password;

import java.util.Date;

/**
 * Created by Maxime on 09/03/2017.
 */
public class Member {

    private String nom;
    private String prenom;
    private String email;
    private String date;
    private String telephone;
    private String sexe;
    private String pass1;
    private String pass2;
    private String pays;

    /**
     * @param nom
     * @param prenom
     * @param email
     * @param date
     * @param telephone
     * @param sexe
     * @param pass1
     * @param pass2
     * @param pays
     */
    public Member(String nom, String prenom, String email, String date, String telephone, String sexe, String pass1, String pass2, String pays) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date = date;
        this.telephone = telephone;
        this.sexe = sexe;
        this.pass1 = pass1;
        this.pass2 = pass2;
        this.pays = pays;
    }

    /**
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return
     */
    public String getPass1() {
        return pass1;
    }

    /**
     * @param pass1
     */
    public void setPass1(String pass1) {
        this.pass1 = pass1;
    }

    /**
     * @return
     */
    public String getPass2() {
        return pass2;
    }

    /**
     * @param pass2
     */

    public void setPass2(String pass2) {
        this.pass2 = pass2;
    }

    /**
     * @return
     */
    public String getPays() {
        return pays;
    }

    /**
     * @param pays
     */
    public void setPays(String pays) {
        this.pays = pays;
    }
}
