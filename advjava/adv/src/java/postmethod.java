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
@WebServlet(urlPatterns = {"/postmethod"})

   public class postmethod extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        d(request, response);
     
    }
    protected void d(HttpServletRequest request, HttpServletResponse response)
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
     
    }
      
}
