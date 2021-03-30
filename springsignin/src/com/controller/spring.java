package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class spring {
	
	@RequestMapping(value="world.html",method = RequestMethod.GET)
	public ModelAndView helloworld()
	{
		String s1 = "HELLO ! ";
		return new ModelAndView("hello", "msg", s1);
	}
	@RequestMapping(value="signup.html",method= RequestMethod.GET)
	public ModelAndView Load()
	{
		return new ModelAndView("signup");
	}
	@RequestMapping(value="verify.html",method= RequestMethod.GET)
	public ModelAndView verify(HttpServletRequest req, HttpServletResponse res)
	{
		String un = req.getParameter("un");
		String ps = req.getParameter("pass");
		if(un.equals("admin") && ps.equals("admin"))
		{
			return new ModelAndView("welcome");
		}
		else
		{
			return new ModelAndView("signup");
		}
	}
	
}
