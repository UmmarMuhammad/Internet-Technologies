<%-- 
    Document   : tags
    Created on : May 28, 2020, 12:20:11 AM
    Author     : UMMAR MUHAMMAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>tag library!</h1>
             
        <c:out value="taglib">

        </c:out>
        <c:import url="http://google.com"/>
    
        <!--this will be invoked from a servlet only-->
        <c:forEach items="${attrib}" var="s">
            ${s}<br/>
        </c:forEach>

        <s:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/college" user="root" password="ummarmuhammad"/>
        <s:query var="rs" dataSource="${db}">
            Select * from student
        </s:query>
    </body>
</html>
