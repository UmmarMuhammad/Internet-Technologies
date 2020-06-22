/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UmmarMuhammad.InternetTech;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UMMAR MUHAMMAD
 */
/**
 *
 * @author UMMAR MUHAMMAD
 */
//@WebServlet("/jsp2servlet")
public class filterServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        int no = Integer.parseInt(req.getParameter("num1"));

        PrintWriter out = res.getWriter();
        out.println("Square = " + no*no);
    }
}
