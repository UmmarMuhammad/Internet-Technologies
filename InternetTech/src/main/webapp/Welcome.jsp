<%-- 
    Document   : Welcome
    Created on : Jun 4, 2020, 12:51:35 AM
    Author     : UMMAR MUHAMMAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <%
            if (session.getAttribute("user") == null)
            {
                response.sendRedirect("Login.jsp");
            }

        %>
        welcome ${user}
        <a href="About.jsp">About</a>
        <form action="Logout">
            <input type="submit" value="Logout">
        </form>
    </body>
</html>
