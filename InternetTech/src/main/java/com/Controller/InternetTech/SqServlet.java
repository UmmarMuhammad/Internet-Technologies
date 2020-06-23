package com.Controller.InternetTech;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//dispatched from AddServlet
@WebServlet("/Sq")
public class SqServlet extends HttpServlet
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