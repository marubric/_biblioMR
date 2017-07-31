/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.oliviercailloux.y2017.bibliomr.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mrubrice
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login, password;


        login = request.getParameter("login");
        password = request.getParameter("password");

        if(login.equals(password)){
            RequestDispatcher rd = request.getRequestDispatcher("accueil.jsp");
            rd.forward(request,response);
        }
        else
            response.sendRedirect("index.html");

        System.out.println("coucou "+login);
    }

}
