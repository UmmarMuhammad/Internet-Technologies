<%-- 
    Document   : dbConnection
    Created on : May 24, 2020, 12:22:45 AM
    Author     : UMMAR MUHAMMAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="errors.jsp"%>
<%@page import= "java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JDBC</title>
    </head>
    <body>
        <h1></h1>
        <%
            String connector = "com.mysql.cj.jdbc.Driver";
            //url of the database server along with the port no. & database name
            String url = "jdbc:mysql://localhost:3306/college";
            //username of the mysql server 
            String user = "root";
            //password of the server set during start of the service
            String pwd = "ummarmuhammad";

            //2.2 
            //register the mysql driver for java  
            Class.forName(connector);

            //3
            //establish the connection using url, username & password
            Connection con = null;
            con = DriverManager.getConnection(url, user, pwd);

            //4
            //create the statement
            Statement stmt = con.createStatement();

            //5
            //query the database using a valid query
            String query = "Select Name from student where RollNo= 10";
            //execute the query specified above, & get the results in resultset
            ResultSet rs = stmt.executeQuery(query);

            //6
            //process results
            rs.next();
            String name = rs.getString("Name");
            out.println("Name = " + name);

            //7
            //close connection
            //System.out.println(" "+name);
            stmt.close();
        %>
    </body>
</html>