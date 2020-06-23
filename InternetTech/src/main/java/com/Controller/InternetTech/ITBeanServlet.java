package com.Controller.InternetTech;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.Model.InternetTech.ITBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UMMAR MUHAMMAD
 */
public class ITBeanServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        int x = Integer.parseInt(request.getParameter("num1"));
        int y = Integer.parseInt(request.getParameter("num2"));

        PrintWriter out = response.getWriter();
        
        ITBean bean = new ITBean();
        bean.setNum1(x);
        bean.setNum2(y);
        bean.add();
        int sum = bean.getSum();      
        out.println("Sum = " + sum);
    }
}
