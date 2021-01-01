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
                   
          if(true)//only use equal to sign here and no .equals function
            {%>
                response.sendRedirect("Login.jsp");
            <%}
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
