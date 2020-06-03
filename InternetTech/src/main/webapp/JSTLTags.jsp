<%-- 
    Document   : tags
    Created on : May 28, 2020, 12:20:11 AM
    Author     : UMMAR MUHAMMAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>tag library!</h1>
        <%--
                <c:out value="taglib">

        </c:out>
        <c:import url="http://google.com"/>

        <!--this will be invoked from a servlet only-->
        <c:forEach items="${attrib}" var="s">
            ${s}<br/>
        </c:forEach>
        --%>
        <s:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/college" user="root" password="ummarmuhammad"/>
        <s:query var="rs" dataSource="${db}">
            Select * from student
        </s:query>
        <c:forEach items="${rs.rows}" var="std">
            <br/>
            <c:out value="${std.name}"></c:out>
        </c:forEach>

        <c:set var="str" value="ummar muhammad"/>
        <br/>
        Length: ${f:length(str)}
        <br/>
        <form name="Filters" action="jsp2servlet" method="get"><br/>
            <label for="num1">Filter</label><br/>
            <label for="num1">Name:</label>
            <input type="text" id="num1" name="num1" value="0">
            <input type="submit" value="Submit"> 
        </form>
    </body>
</html>
