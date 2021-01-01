/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADITYA
 */
@WebServlet(urlPatterns = {"/Logout"})
public class Logout extends HttpServlet {

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//http 1.1
            response.setHeader("pragma", "no-cache");//http 1.0
            response.setHeader("Expires", "0");//proxy server
            /*removin back button problem*/
        HttpSession session=request.getSession();
        session.removeAttribute("user");
        session.invalidate();
        response.sendRedirect("Login.jsp");
        }
    }

   