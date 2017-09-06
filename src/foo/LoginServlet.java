package foo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msg = request.getParameter("username");

        String msg1 = request.getParameter("password");

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("message=" + msg);

        out.println("message=" + msg1);
    }

}
