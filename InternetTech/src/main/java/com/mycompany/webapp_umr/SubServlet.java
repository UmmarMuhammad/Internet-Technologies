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
//servlet

public class SubServlet extends HttpServlet
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