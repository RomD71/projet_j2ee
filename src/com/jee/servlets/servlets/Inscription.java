package com.jee.servlets.servlets;

import com.jee.servlets.beans.Member;
import com.jee.servlets.controllers.InscriptionController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Maxime on 03/03/2017.
 */

@WebServlet(name = "Inscription")

public class Inscription extends HttpServlet {
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        InscriptionController inscriptionController = new InscriptionController();
        Member member = inscriptionController.validationForm(request);

        String message;

        if (inscriptionController.getErreurs().isEmpty()) {

            request.setAttribute("member", member);
            message = "Utilisateur créé avec succès !";

            request.setAttribute("message", message);
            this.getServletContext().getRequestDispatcher("/WEB-INF/ConfirmationInscription.jsp").forward(request, response);

        } else {

            request.setAttribute("erreurs", inscriptionController.getErreurs());
            this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);

        }

    }

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nextJSP = "/WEB-INF/inscription.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);

    }
}
