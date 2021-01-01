package servelet_call;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/calling_servelet_part3"})
public class calling_servelet_part3 extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String m=request.getParameter("t1");
      System.out.println(m);
      //using session for sending the data
      HttpSession session=request.getSession();
      session.setAttribute("t1", m);
      //session.invalidate();//invalidates the session
      //session.removeAttribute("t1");//invalidates purticular attributes
 
      response.sendRedirect("calling_servelet_part3_1");
    }

}