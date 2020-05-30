<%-- 
    Document   : dispatch
    Created on : May 24, 2020, 10:05:47 PM
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
        <h1>Dispatched from a servlet to a JSP page</h1>
        <%
            //dispatched from DisServlet
            String student = request.getAttribute("attrib").toString();
            out.println(student);
        %>
        
        ${x}
    </body>
</html>
