package lehieule.miu.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calc02", urlPatterns = "/calc02")
public class Calculator02Servlet extends HttpServlet {
    PrintWriter out;
    String num01, num02, num03, num04;
    String sum012,mul034;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        out = resp.getWriter();
        num01 = req.getParameter("num1");
        num02 = req.getParameter("num2");
        num03 = req.getParameter("num3");
        num04 = req.getParameter("num4");

        sum012 = "";
        if (!"".equals(num01) && !"".equals(num02)){
            Integer sum12 = Integer.parseInt(num01) + Integer.parseInt(num02);
            sum012 = "" + sum12;
        }
        mul034 = "";
        if (!"".equals(num03) && !"".equals(num04)){
            Integer mul34 = Integer.parseInt(num03) * Integer.parseInt(num04);
            mul034 = "" + mul34;
        }
        // Reload HTML
        reLoadHtml();
    }

    // rewrite HTML
    void reLoadHtml() {
        String sum012HTml = String.format("<input type='number' name='num1' value='%s'> + <input type='number' name='num2' value='%s'> = <input type='number' name='sum012' value='%s'><br>", num01, num02,sum012);
        String mul034HTml = String.format("<input type='number' name='num3' value='%s'> * <input type='number' name='num4' value='%s'> = <input type='number' name='mul034' value='%s'><br>", num03, num04,mul034);
        out.println("<form action='calc02' method='post'>");
        out.println(sum012HTml);
        out.println(mul034HTml);
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
    }
}
