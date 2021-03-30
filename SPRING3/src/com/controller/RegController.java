package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.*;
import com.vo.*;

@Controller
public class RegController
	{
    	@Autowired
		RegDAO regDAO;
    	
    	@RequestMapping(value="home.html",method=RequestMethod.GET)
    	public ModelAndView loadInsert()
    		{
    			return new ModelAndView("home","data",new RegVO());
    		}
    
    	@RequestMapping(value="dataInsert.html",method=RequestMethod.GET)
    	public ModelAndView dataInsert(@ModelAttribute RegVO regVO)
    		{	
    			this.regDAO.insert(regVO);	
    			return new ModelAndView("redirect:dataInsert.html");
    		}
      }	
