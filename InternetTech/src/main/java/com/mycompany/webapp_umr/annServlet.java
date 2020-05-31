/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp_umr;

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
@WebServlet("/myAnn")
public class annServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        PrintWriter out = res.getWriter();
        out.println("<html><body bgcolor='grey' >");
        out.println("annotation used instead of servlet/servlet-mapping tag in web.xml");
        out.println("</body></html>");
    }
}