<%-- 
    Document   : newjsp
    Created on : 8 Aug, 2017, 10:20:15 AM
    Author     : ADITYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="Login" method="post">
            
      <%-- 
   use method Post For safety reasons
--%>
Enter User name <input type="text" name="uname"><br>
Enter Password <input type="password" name="pass"><br>
<input type="submit" value="Login">
         
  
    </body>
</html>
