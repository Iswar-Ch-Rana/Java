package CoreJava.JavaServletLifecycleAndHandlingGET_POSTRequests;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DoGetExampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h1>GET Request Received</h1>");
        out.println("<p>Welcome to the DoGetExampleServlet!</p>");
        out.println("</body></html>");
    }
}

