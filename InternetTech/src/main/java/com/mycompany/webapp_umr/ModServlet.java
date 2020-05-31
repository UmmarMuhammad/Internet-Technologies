/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp_umr;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UMMAR MUHAMMAD
 */
//redirect using url rewriting
public class ModServlet extends HttpServlet
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