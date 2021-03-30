package abc;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class sessiondemo
 */
@WebServlet("/sessiondemo")
public class sessiondemo extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			HttpSession ses = request.getSession();
			int count = (int)ses.getAttribute("total");
			PrintWriter out = response.getWriter();
			if(ses.isNew())
			{
				
				count = count + 1
				ses.setAttribute("total",count);
			}
		}

}
