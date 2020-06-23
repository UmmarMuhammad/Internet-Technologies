/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UmmarMuhammad.InternetTech;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UMMAR MUHAMMAD
 */
public class ITIntrospectServlet extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        try
        {
            PrintWriter out = response.getWriter();

            //introspection
            BeanInfo info = Introspector.getBeanInfo(ITBean.class);
            for (PropertyDescriptor pd : info.getPropertyDescriptors())
            {
                out.println(pd.getName());
            }
        } 
        catch (IntrospectionException ex)
        {
            Logger.getLogger(ITBeanServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
