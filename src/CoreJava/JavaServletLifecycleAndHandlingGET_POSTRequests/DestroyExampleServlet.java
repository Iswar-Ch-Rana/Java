package CoreJava.JavaServletLifecycleAndHandlingGET_POSTRequests;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.SQLException;

public class DestroyExampleServlet extends HttpServlet {
    private Connection connection;

    @Override
    public void init(ServletConfig config) throws ServletException {
        // Initialization logic (similar to the InitExampleServlet)
    }

    @Override
    public void destroy() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

