<%-- 
    Document   : errors
    Created on : May 22, 2020, 3:50:10 PM
    Author     : UMMAR MUHAMMAD
--%>
<!--set the isErrorPage--> 
<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body bgcolor="red">
        <!--        <h1>Hello World!</h1>-->
        <%=exception.getMessage()%>
    </body>
</html>
