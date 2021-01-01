/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author ADITYA
 */
@WebFilter(filterName = "MultiFilter2", urlPatterns = {"/Hello2"})
public class MultiFilter2 implements Filter {
       @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       System.out.println("----------------------------------------------------------------------------------------");
       System.out.println("Init method is called in"
               + " "+this.getClass().getName());
       System.out.println("----------------------------------------------------------------------------------------");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
System.out.println("doFilter is called in "+this.getClass().getName());
PrintWriter out =response.getWriter();
String username=request.getParameter("username");
String password=request.getParameter("password");
if(username.equals("Adi")&& password.equals("shobhi"))
{
    out.println("Authentication Filter is invoked Before");
    chain.doFilter(request, response);
     out.println("Authentication Filter is invoked After");
    //send request to next resource
}
else
{
    out.println("Wrong username or password");
    
}
    }

    @Override
    public void destroy() 
    {
           System.out.println("----------------------------------------------------------------------------------------");
       System.out.println("Destroy method is called in"
               + " "+this.getClass().getName());
       System.out.println("----------------------------------------------------------------------------------------");   
    }
     

}

          
   
    

