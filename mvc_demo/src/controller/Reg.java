package controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import vo.*;
import dao.*;
/**
 * Servlet implementation class Reg
 */
@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   			
		   String fn = request.getParameter("reg_fn");
		   String ln = request.getParameter("reg_ln");
		   Regvo obj = new Regvo();
		   obj.setFn(fn);
		   obj.setLn(ln);  
		   regdao dao = new regdao();
		   dao.insert(obj);
		   
		   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
