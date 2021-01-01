/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADITYA
 */
public class VISITCOUNTER extends HttpServlet {
int i;//declearation section
@Override
public void init()
{i=1;
    
}
   
   public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
   {
       PrintWriter out=response.getWriter();
       out.println(i);
       i++;
   }

}
