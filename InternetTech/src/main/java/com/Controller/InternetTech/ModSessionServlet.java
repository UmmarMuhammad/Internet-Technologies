/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Controller.InternetTech;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author UMMAR MUHAMMAD
 */
//re-direct using session
public class ModSessionServlet extends HttpServlet
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