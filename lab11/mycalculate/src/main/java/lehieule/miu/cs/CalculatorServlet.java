package lehieule.miu.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc01")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        String num01 = req.getParameter("num1");
        String num02 = req.getParameter("num2");
        String num03 = req.getParameter("num3");
        String num04 = req.getParameter("num4");
        if (!"".equals(num01) && !"".equals(num02)){
            Integer sum012 = Integer.parseInt(num01) + Integer.parseInt(num02);
            out.println(num01 + " + " + num02 + " = " + sum012);
        }
        if (!"".equals(num03) && !"".equals(num04)){
            Integer mul034 = Integer.parseInt(num03) * Integer.parseInt(num04);
            out.println(num03 + " * " + num04 + " = " + mul034);
        }
    }
}

