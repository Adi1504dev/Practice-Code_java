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

/**
 *
 * @author ADITYA
 */
@WebServlet(urlPatterns = {"/Hello1"})
public class HelloWorld1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         System.out.println("----------------------------------------------------------------------------------------");
       System.out.println("Doget method is called in"
               + " "+this.getClass().getName());
       System.out.println("----------------------------------------------------------------------------------------");
        PrintWriter out =response.getWriter();
        out.println("Welcome to World");
        }
    }

    


