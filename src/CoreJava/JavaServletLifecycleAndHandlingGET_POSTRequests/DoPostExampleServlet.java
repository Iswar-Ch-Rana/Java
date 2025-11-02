package CoreJava.JavaServletLifecycleAndHandlingGET_POSTRequests;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DoPostExampleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");

        out.println("<html><body>");
        out.println("<h1>POST Request Received</h1>");
        out.println("<p>Hello, " + name + "!</p>");
        out.println("</body></html>");
    }
}
