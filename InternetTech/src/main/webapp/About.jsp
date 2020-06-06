<%-- 
    Document   : About
    Created on : Jun 4, 2020, 12:52:39 AM
    Author     : UMMAR MUHAMMAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About</title>
    </head>
    <body>
        <%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            if (session.getAttribute("user") == null)
            {
                response.sendRedirect("Login.jsp");
            }

        %>
        <h1>this is the lab course for bca 5th semester of uok... </h1>
        <iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
    </body>
</html>
