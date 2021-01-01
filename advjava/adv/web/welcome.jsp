<%-- 
    Document   : welcome
    Created on : 8 Aug, 2017, 10:34:17 AM
    Author     : ADITYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
                    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//http 1.1
            response.setHeader("pragma", "no-cache");//http 1.0
            response.setHeader("Expires", "0");//proxy server
            /*removin back button problem*/
          if(session.getAttribute("user")==(null))//only use equal to sign here and no .equals function
            {
                response.sendRedirect("Login.jsp");
            }
            %>
            Welcome....
            <a href="vedio.jsp" > vedio here</a>
                <%-- 
   Logout Button
--%>
<form action="Logout" method="post">
    <input type="submit" value="Logout">
</form>
    </body>
</html>
