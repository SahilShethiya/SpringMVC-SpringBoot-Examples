package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RegDAO;
import vo.RegVO;

/**
 * Servlet implementation class RegController
 */
@WebServlet("/RegController")
public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String s6=request.getParameter("f");
		if(s6.equals("v1"))
		{
			String s5=request.getParameter("id");
			
			int x=Integer.parseInt(s5);
			RegVO regVO2=new RegVO();
			RegDAO regDAO2=new RegDAO();
		
			regVO2.setId(x);
			regDAO2.delet(regVO2);
		}
		if(s6.equals("v2"))
		{
			List x=new ArrayList();
			HttpSession b=request.getSession();
			String s12=request.getParameter("ff");
			RegVO regVO3=new RegVO();
			RegDAO regDAO3=new RegDAO();
			regVO3.setFirstname(s12);
			x = regDAO3.edi(regVO3);	
			b.setAttribute("ls",x);
			response.sendRedirect("edit.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s3=request.getParameter("f");
		if(s3.equals("insert"))
		{
		String firstname=request.getParameter("fn");
		String lastname=request.getParameter("ln");
		String password=request.getParameter("password");
		String gender=request.getParameter("gender");
		String city=request.getParameter("city");
		String a[]=request.getParameterValues("hobby");
		String d="";
		if(a!=null)
		{
		for(int m=0;m<a.length;m++)
		{
				d=d+a[m]+"  ";
		}
		}
		
		RegVO regVO=new RegVO();
		
		regVO.setFirstname(firstname);
		regVO.setLastname(lastname);
		regVO.setPassword(password);
		regVO.setGender(gender);
		regVO.setCity(city);
		regVO.setHobby(d);
		
		RegDAO regDAO=new RegDAO();
		regDAO.insert(regVO);
		}
		if(s3.equals("search"))
		{
			List l=new ArrayList();
			HttpSession b=request.getSession();
		
			response.setContentType("text/html");
		
			String s1=request.getParameter("fn");
			String s2=request.getParameter("ln");
		
			RegVO regVO1=new RegVO();
			RegDAO regDAO1=new RegDAO();
		
			regVO1.setFirstname(s1);
			regVO1.setLastname(s2);
			l=regDAO1.select(regVO1);	
			b.setAttribute("ls",l);
			response.sendRedirect("search.jsp");
		}
	
	}
}
