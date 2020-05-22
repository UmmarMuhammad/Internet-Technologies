<%-- 
    Document   : ServerPage
    Created on : May 5, 2020, 3:23:14 PM
    Author     : UMMAR MUHAMMAD
    Modified on: 2020-05-22  
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="errors.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <LINK rel="Stylesheet" href="Styles_Umr.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--        1. directive tag-->
        <%@page  import="java.util.Date" %>

        <!--        2. declarative tag-->
        <%!
            int sum = 0;
            float avg = 0;
            int date = 0;
        %>
        <!--        3. scriptlet tag-->
        <%
            try
            {
                int n1 = Integer.parseInt(request.getParameter("num1"));
                int n2 = Integer.parseInt(request.getParameter("num2"));

                sum = n1 + n2;
                avg = sum / 2f;

                out.println("result = " + sum);
                Date d = new Date();
                date = d.getDate();
                int q = 1 / 0;//exception handled through try-catch
            } catch (Exception e)
            {
                out.println(e.getMessage());
            }
            //exception handled through ErrorPage errors.jsp
            int q = 1 / 0;
        %>
        <!--        4. expression tag-->
        <%=sum%>
        <%=avg%>
        <%="todays date is = " + date%>
    </body>
</html>
