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

/**
 *
 * @author ADITYA
 */
@WebServlet(urlPatterns = {"/calling_servelet_part2"})
public class calling_servelet_part2 extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String m=request.getParameter("t1");
      System.out.println(m);
       
 //This method is used to send data
  RequestDispatcher rd=request.getRequestDispatcher("calling_servelet_part2_1");//calling_servelet1 this is name of second servelet to be called
rd.forward(request, response);      //1ST METHOD
  

    }

}