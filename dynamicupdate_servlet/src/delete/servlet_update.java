package delete;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


@WebServlet("/servlet_update")
public class servlet_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try{
			response.setContentType("text/html");
			String user = request.getParameter("id");
			HttpSession session = request.getSession();
			session.setAttribute("user_name",user);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/demo_login","root","root");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("select *from userdata where username='"+user+"' ");
			String fn="",ln="";
			while(rs.next())
			{
				 fn = rs.getString(1);
				 ln = rs.getString(2);
			}
			rs.close();
			s.close();
			con.close();
			out.println("<html>");
			out.println("<body>");
			out.println("<form action=edit_demo method=get>");
			out.print("FirstName : ");
			out.println("<input type=text value="+fn+" name=f_name />");
			out.println("<br>");
			out.print("LastName : ");
			out.println("<input type=text value="+ln+" name=l_name />");
			out.println("<br>");
			out.println("<input type=submit value=Edit />");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
			/*if(no!=0)
			{
				response.sendRedirect("servlet_select");
			}
			else
			{
				out.println("Operation failed");
			}*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
