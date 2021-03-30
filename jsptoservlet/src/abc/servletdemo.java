package abc;

import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/**
 * Servlet implementation class servletdemo
 */
@WebServlet("/servletdemo")
public class servletdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public servletdemo() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("uname");
		PrintWriter out = response.getWriter();
		out.println("Hello, "+name);
	}

	
}
