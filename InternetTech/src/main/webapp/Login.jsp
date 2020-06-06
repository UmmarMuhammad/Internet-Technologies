<%-- 
    Document   : Login
    Created on : Jun 4, 2020, 12:50:56 AM
    Author     : UMMAR MUHAMMAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form name="Filters" action="Login" method="post"><br/>            
            <label for="user">User ID: </label>
            <input type="text" id="user" name="user" value=""><br>
            <label for="pwd">Password</label>
            <input type="password" id="num2" name="pwd" value="">
            <input type="submit" value="Submit"> 
        </form>
    </body>
</html>
