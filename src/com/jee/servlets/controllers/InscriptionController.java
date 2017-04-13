package com.jee.servlets.controllers;

import com.jee.servlets.beans.Member;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maxime on 21/03/2017.
 */


public class InscriptionController {
    public static final String NOM = "nom";
    public static final String PRENOM = "prenom";
    public static final String EMAIL = "email";
    public static final String DATE = "date";
    public static final String TELEPHONE = "telephone";
    public static final String SEXE = "sexe";
    public static final String PASS1 = "password";
    public static final String PASS2 = "password";
    public static final String PAYS = "pays";
    public static final String ATTRIBUTE_MEMBER = "member";

    /**
     *
     * @return
     */
    public Map<String, String> getErreurs() {
        return this.erreurs;
    }

    private Map<String, String> erreurs = new HashMap<String, String>();

    /**
     *
     * @param request
     * @return
     */
    public Member validationForm(HttpServletRequest request) {

        String nom = request.getParameter(NOM);
        String prenom = request.getParameter(PRENOM);
        String email = request.getParameter(EMAIL);
        String date = request.getParameter(DATE);
        String telephone = request.getParameter(TELEPHONE);
        String sexe = request.getParameter(SEXE);
        String pass1 = request.getParameter(PASS1);
        String pass2 = request.getParameter(PASS2);
        String pays = request.getParameter(PAYS);

        Member member = new Member(nom, prenom, email, date, telephone, sexe, pass1, pass2, pays);

        validation(member);


        return member;
    }

    /**
     *
     * @param member
     */
    public void validation(Member member) {
        this.validationNom(member.getNom());
        this.validationPrenom(member.getPrenom());
        this.validationEmail(member.getEmail());
        this.validationDate(member.getDate());
        this.validationTelephone(member.getTelephone());
        this.validationSexe(member.getSexe());
        this.validationPass1(member.getPass1());
        this.validationPass2(member.getPass2());
        this.validationPays(member.getPays());
    }

    /**
     *
     * @param nom
     * @return
     */
    boolean validationNom(String nom) {
        if (nom == null || nom.isEmpty()) {
            erreurs.put(NOM, "Le nom utilisateur doit être renseigné");
        }
        return true;
    }

    /**
     *
     * @param prenom
     * @return
     */
    boolean validationPrenom(String prenom) {
        if (prenom == null || prenom.isEmpty()) {
            erreurs.put(PRENOM, "Le prenom utilisateur doit être renseigné");
        }
        return true;
    }

    /**
     *
     * @param email
     * @return
     */
    boolean validationEmail(String email) {
        if (email == null || email.isEmpty()) {
            erreurs.put(EMAIL, "Le mail utilisateur doit être renseigné");
        }
        return true;
    }

    /**
     *
     * @param date
     * @return
     */
    boolean validationDate(String date) {
        if (date == null || date.isEmpty()) {
            erreurs.put(DATE, "La date doit être renseigné");
        }
        return true;
    }

    /**
     *
     * @param telephone
     * @return
     */
    boolean validationTelephone(String telephone) {
        if (telephone == null || telephone.isEmpty()) {
            erreurs.put(TELEPHONE, "Le telephone utilisateur doit être renseigné");
        }
        return true;
    }

    /**
     *
     * @param sexe
     * @return
     */
    boolean validationSexe(String sexe) {
        if (sexe == null || sexe.isEmpty()) {
            erreurs.put(SEXE, "Le sexe utilisateur doit être renseigné");
        }
        return true;
    }

    /**
     *
     * @param pass1
     * @return
     */
    boolean validationPass1(String pass1) {
        if (pass1 == null || pass1.isEmpty()) {
            erreurs.put(PASS1, "Le password utilisateur doit être renseigné");
        }
        return true;
    }

    /**
     *
     * @param pass2
     * @return
     */
    boolean validationPass2(String pass2) {
        if (pass2 == null || pass2.isEmpty()) {
            erreurs.put(PASS2, "Confirmez le mot de passe");
        }
        return true;
    }

    /**
     *
     * @param pays
     * @return
     */
    boolean validationPays(String pays) {
        if (pays == null || pays.isEmpty()) {
            erreurs.put(PAYS, "Le pays doit être renseigné");
        }
        return true;
    }

}

