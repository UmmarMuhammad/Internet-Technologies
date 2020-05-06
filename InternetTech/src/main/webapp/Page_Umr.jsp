<%-- 
    Document   : ServerPage
    Created on : May 5, 2020, 3:23:14 PM
    Author     : UMMAR MUHAMMAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <LINK rel="Stylesheet" href="Styles_Umr.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            int n1 = Integer.parseInt(request.getParameter("num1"));
            int n2 = Integer.parseInt(request.getParameter("num2"));

            int sum = n1 + n2;

            out.println("result = " + sum);
        %>
    </body>
</html>
