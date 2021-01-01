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
@WebServlet(urlPatterns = {"/getmethod"})//attonoation to mention it is web servelet
public class getmethod extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int i=Integer.parseInt(request.getParameter("t1"));
            int j=Integer.parseInt(request.getParameter("t2"));
           int k=i+j;
           PrintWriter out=response.getWriter();
       out.println("<html>");//html code can also be written
      out.println("<body>");
        out.println(" <br>");
         out.println(k);
        out.println(" </br>");
         out.println("</body>");
               out.println("</html>");
                  out.println("<html>\n" +
"    \n" +
"    <body>\n" +
"        <form action=\"getmethod1\" method=\"get\"><!--\n" +
"this means ki is form ka action tab hoga jab url main get method ho\n" +
"-->\n" +
"            <br>\n" +
"            GET METHOD</BR>\n" +
"        Enter 1st number:<input type=\"text\" name=\"t1\">\n" +
"        <br> Enter 2nd number:<input type=\"text\" name=\"t2\">\n" +
"        <br>\n" +
"        <input type=\"submit\" value=\"sub\">\n" +
"        </form>"
                          + "</body>\n" +
"</html>");
     
    }
}

 
   
   
   
