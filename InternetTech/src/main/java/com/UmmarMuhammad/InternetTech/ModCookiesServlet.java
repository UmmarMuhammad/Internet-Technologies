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

/**
 *
 * @author UMMAR MUHAMMAD
 */
//rredirect using cookies
public class ModCookiesServlet extends HttpServlet
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