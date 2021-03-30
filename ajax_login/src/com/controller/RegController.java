package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.*;
import com.vo.*;

@Controller
public class RegController
	{
    	@Autowired
		RegDAO regDAO;
    	RegVO regVO;
 
    	@RequestMapping(value="home.html",method=RequestMethod.GET)
    	public ModelAndView home()
    		{
    			return new ModelAndView("home");
    		}
    
    	@RequestMapping(value="check.html",method=RequestMethod.GET)
    	public ModelAndView authenticate(HttpServletRequest  req,@RequestParam("uname") String uname,@RequestParam("upass") String upass)
    		{	
    			regVO = new RegVO();
    			regVO.setUsername(uname);
    			regVO.setPassword(upass);
    			int length = this.regDAO.check(regVO);
    			System.out.print(length);
    			HttpSession ses = req.getSession();
    			ses.setAttribute("len", length);
    			return new ModelAndView("login");
    		}
      }	

    	
