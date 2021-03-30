package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    	
 
    	@RequestMapping(value="loadInsert.html",method=RequestMethod.GET)
    	public ModelAndView loadInsert()
    		{
    			return new ModelAndView("insert","data",new RegVO());
    		}
    
    	@RequestMapping(value="dataInsert.html",method=RequestMethod.GET)
    	public ModelAndView search(@ModelAttribute RegVO regVO,HttpServletRequest req)
    		{	
    			List  list = this.regDAO.search(regVO);		
    			HttpSession ses = req.getSession();
    			ses.setAttribute("list", list);
    			return new ModelAndView("redirect:dataInsert.html");
    		}    
	}	

    	
