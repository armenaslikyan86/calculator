package am.test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        int n1 = Integer.parseInt(req.getParameter("txt1"));
        int n2 = Integer.parseInt(req.getParameter("txt2"));
        String op = req.getParameter("op");


        if(op.equals("Addition")){
            out.println("<h1>Addition result: </h1>" + (n1 + n2));
        }
        else if(op.equals("Subtraction")){
            out.println("<h1>Subtraction result: </h1>" + (n1 - n2));
        }
        else if(op.equals("multiplication")){
            out.println("<h1>Multiplication result: </h1>" + (n1 * n2));
        }
        else{
            out.println("<h1>Division result: </h1>" + (n1 / n2));
        }
    }
}
