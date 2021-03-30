package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import vo.*;
import dao.*;

@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   String s_fn = request.getParameter("reg_fn");
		   Regvo obj = new Regvo();
		   obj.setFn(s_fn);
		   
		   regdao obj1 = new regdao();
		   
		   List new_list = new ArrayList();
		   
		   new_list =  obj1.search(obj);
		   
		   System.out.println("Size : "+new_list.size());
		   
		   HttpSession ses = request.getSession();
		   
		   ses.setAttribute("list", new_list);
	
		   response.sendRedirect("display.jsp");
   	}
   	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
