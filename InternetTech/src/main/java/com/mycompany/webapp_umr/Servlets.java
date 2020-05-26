/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp_umr;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author UMMAR MUHAMMAD
 */
public class Servlets extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        ServletContext contxt = getServletContext();
        String str = contxt.getInitParameter("param");
        PrintWriter out = res.getWriter();
        out.println(str);

        ServletConfig config = getServletConfig();
        str = config.getInitParameter("param");

        out.println(str);
    }
}

/**
 *
 * @author UMMAR MUHAMMAD this servlet will dispatch to another servlet
 * SqServlet
 */
class AddServlet extends HttpServlet
{

    //we can use doGet() or doPost as well
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = sum(i, j);

        req.setAttribute("k", k);
        RequestDispatcher rd = req.getRequestDispatcher("Sq");
        rd.forward(req, res);
    }

    int sum(int a, int b)
    {
        int c = a + b;
        return c;
    }

}

//dispatched from AddServlet
class SqServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        int k = (int) req.getAttribute("k");

        k *= k;

        PrintWriter out = res.getWriter();
        out.println("result = " + k + "  love u");
    }
}
//servlet

class SubServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i - j;
        PrintWriter out = res.getWriter();
        out.println("result = " + k);
    }
}
//re-direct using different methods

class OddEvenServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {

        int i = Integer.parseInt(req.getParameter("num1"));
        int method = Integer.parseInt(req.getParameter("Method"));
        PrintWriter out = res.getWriter();
        out.println(method);
        switch (method)
        {
            case 1:
                //method 1: 
                res.sendRedirect("Mod?k=" + i);//url rewritting
                break;
            case 2:
                //method 2: session
                HttpSession session = req.getSession();
                session.setAttribute("k", i);
                res.sendRedirect("ModSession");
                break;
            case 3:
                //method 3
                Cookie cookie = new Cookie("k", i + "");
                res.addCookie(cookie);
                res.sendRedirect("ModCookie");
        }
    }
}

//redirect using url rewriting
class ModServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {

        int i = Integer.parseInt(req.getParameter("k"));

        int m = i % 2;
        PrintWriter out = res.getWriter();
        out.println("URL Re-writing Redirect used.");
        if (m == 0)
        {
            out.println(i + " is even");
        } else
        {
            out.println(i + " is odd");
        }
    }
}

//re-direct using session
class ModSessionServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {

        HttpSession session = req.getSession();
        int i = (int) session.getAttribute("k");

        int m = i % 2;
        PrintWriter out = res.getWriter();
        out.println("Session Redirect used.");
        if (m == 0)
        {
            out.println(i + " is even");
        } else
        {
            out.println(i + " is odd");
        }
    }
}

//rredirect using cookies
class ModCookieServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {

        int i = 0;
        Cookie cookies[] = req.getCookies();
        for (Cookie c : cookies)
        {
            if (c.getName().equals("k"))
            {
                i = Integer.parseInt(c.getValue());
            }
        }

        int m = i % 2;
        PrintWriter out = res.getWriter();
        out.println("Cookies Redirect used.");
        if (m == 0)
        {
            out.println(i + " is even");
        } else
        {
            out.println(i + " is odd");
        }
    }
}

/**
 *
 * @author UMMAR MUHAMMAD
 */
@WebServlet("/myAnn")
class annServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        PrintWriter out = res.getWriter();
        out.println("<html><body bgcolor='grey' >");
        out.println("annotation used instead of servlet/servlet-mapping tag in web.xml");
        out.println("</body></html>");
    }
}

/**
 *
 * @author UMMAR MUHAMMAD
 */
@WebServlet("/dispatchToJSP")
class DisServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        String Name = req.getParameter("num1");

        req.setAttribute("x", Name);
        RequestDispatcher rd = req.getRequestDispatcher("dispatch.jsp");
        rd.forward(req, res);
    }
}
