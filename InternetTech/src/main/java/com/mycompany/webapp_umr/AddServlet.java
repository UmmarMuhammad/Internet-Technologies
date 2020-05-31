
import java.io.IOException;
import javax.servlet.RequestDispatcher;
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

/**
 *
 * @author UMMAR MUHAMMAD this servlet will dispatch to another servlet
 * SqServlet
 */
@WebServlet("/Add")
public class AddServlet extends HttpServlet
{

    //we can use doGet() or doPost as well
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = sum(i, j);

        req.setAttribute("k", k);
        RequestDispatcher rd = req.getRequestDispatcher("Sq");
        rd.forward(req, res);
    }

    int sum(int a, int b)
    {
        int c = a + b;
        return c;
    }
}