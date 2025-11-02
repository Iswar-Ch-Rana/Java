package CoreJava.JavaServletLifecycleAndHandlingGET_POSTRequests;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServiceExampleServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest httpReq = (HttpServletRequest) req;
        HttpServletResponse httpRes = (HttpServletResponse) res;

        String method = httpReq.getMethod();
        if (method.equals("GET")) {
            doGet(httpReq, httpRes);
        } else if (method.equals("POST")) {
            doPost(httpReq, httpRes);
        } else {
            httpRes.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Method Not Supported");
        }
    }
}

