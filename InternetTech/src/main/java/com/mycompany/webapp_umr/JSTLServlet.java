/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webapp_umr;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.RequestDispatcher;
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
@WebServlet("/jstlTags")
public class JSTLServlet extends HttpServlet
{

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        List<Student> stds = Arrays.asList(new Student(91, "apple"), new Student(92, "ball"), new Student(93, "cat"));

        req.setAttribute("attrib", stds);
        RequestDispatcher rd = null;
        rd = req.getRequestDispatcher("tags.jsp");
        rd.forward(req, res);
    }
}

