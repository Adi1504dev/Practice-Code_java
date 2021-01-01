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
@WebServlet(urlPatterns = {"/Login"})
public class Login extends HttpServlet {

  
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//http 1.1
            response.setHeader("pragma", "no-cache");//http 1.0
            response.setHeader("Expires", "0");//proxy server
            /*removin back button problem*/
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
if(uname.equals("Adi") && pass.equals("shobhi")) 
{
    HttpSession session=request.getSession();
    session.setAttribute("user",uname);
    response.sendRedirect("welcome.jsp");
    
}
else
{
    response.sendRedirect("Login.jsp");
}
        }
    }



