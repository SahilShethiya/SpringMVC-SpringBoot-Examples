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
import vo.userVO;

/**
 * Servlet implementation class RegController
 */
@WebServlet("/RegController")
public class RegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstname=request.getParameter("fn");
		String lastname=request.getParameter("ln");
		String password=request.getParameter("pass");
		String username = request.getParameter("uname");		
		
		userVO userVO = new userVO();
		userVO.setUsername(username);
		userVO.setPassword(password);
		RegDAO dao = new RegDAO();
		dao.insert1(userVO);
		
		RegVO regVO=new RegVO();
		regVO.setFirstname(firstname);
		regVO.setLastname(lastname);
		regVO.setUv(userVO);
		dao.insert(regVO);
		
	}
}
