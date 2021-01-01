<%-- 
    Document   : newjsp
    Created on : 8 Aug, 2017, 10:20:15 AM
    Author     : ADITYA
--%>

<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.Locale"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--Ye tabhi chale jab browser pe sirf ek language either telgu ya hindi set ho -->
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <%
            String lang=request.getHeader("accept-language");
            Locale l=new Locale(lang);
            ApplicationContext ap=new ClassPathXmlApplicationContext("files/di.xml");            
String value=ap.getMessage("lable",null,l);
        
        %>
        <form action="Login" method="post">
            
      <%-- 
   use method Post For safety reasons
--%>
      <%=value%>: <input type="text" name="uname"><br>
      <%=lang%>:
<input type="submit" value="Login">
         
  
    </body>
</html>
