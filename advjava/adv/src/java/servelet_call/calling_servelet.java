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
@WebServlet(urlPatterns = {"/calling_servelet"})
public class calling_servelet extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      System.out.println("THIS IS FIRST SERVELET");
        PrintWriter out=response.getWriter();
 out.println("THIS IS FIRST SERVELET");
 //see Address bar
  /*RequestDispatcher rd=request.getRequestDispatcher("calling_servelet1");//calling_servelet1 this is name of second servelet to be called
rd.forward(request, response); */     //1ST METHOD
  
//2ND METHOD
//IN THIS METHOD THE USER KNOWS THAT HIS REQUEST HAS BEEN SENT TO SECOND SERVELET
//BY LOOKING AT THE ADDRESS BAR
//WHILE IN THE FIRST METHOD THE FIRST SERVELET TAKES THE REQUEST TO THE SECOND SECOND SERVELET GETS THE OUTPUT FROM
//THERE AND RETURNS THE RESPONSE
// THE USER THINK FIRST SERVELET IS DOING THE JOB
response.sendRedirect("calling_servelet1");
//see Address bar
    }

}