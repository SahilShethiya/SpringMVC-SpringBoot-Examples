package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class spring {
	@RequestMapping(value="signup.html",method= RequestMethod.GET)
	public ModelAndView Load()
	{
		return new ModelAndView("signup");
	}
	@RequestMapping(value="verify.html",method= RequestMethod.GET)

	
}
