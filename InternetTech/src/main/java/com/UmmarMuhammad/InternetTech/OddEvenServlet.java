/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UmmarMuhammad.InternetTech;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author UMMAR MUHAMMAD
 */
//re-direct using different methods

public class OddEvenServlet extends HttpServlet
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