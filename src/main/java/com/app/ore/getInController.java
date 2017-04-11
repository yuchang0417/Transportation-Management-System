package com.app.ore;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import com.app.model.*;

import com.app.dao.UserService;
import com.app.dao.*;
@Controller
public class getInController {
	
	private static final Logger logger = LoggerFactory.getLogger(getInController.class);	
	
	@Autowired
	private UserService userService;
	@Autowired
	private ManagerService ManagerService;
	
	@Autowired
	private VisitorService VisitorService;
	
	
	/*
	@RequestMapping(value = "/ogin", method = RequestMethod.GET )
	  public String login() {
	      return "login";
	  }
	
	*/
	
	@RequestMapping(value="/getIn", method = RequestMethod.GET )
	public String LoginTranser(Model model)
	{
		return "getin";
				
	}
	
	
	@RequestMapping(value="/out", method = RequestMethod.GET )
	public String outTranser(Model model)
	{
		return "base.logout";
				
	}
/*
	
	
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public String home(Model model) {
			return "base/definition";
		}
		*/
		
		@RequestMapping(value = "/loginsubmit", method = RequestMethod.POST)
		public String loginsubmit(Model model,HttpServletRequest request) throws Exception {
			String LoginID=request.getParameter("LoginID");
			String userType=request.getParameter("userType");
			String password=request.getParameter("password");
			
			System.out.println(LoginID + userType+ password);
			if(userType.equalsIgnoreCase("Manager"))
			{
				Manager Manager=ManagerService.getManager(Integer.parseInt(LoginID));
				if(Manager==null)
				{ 
					return "base/logout";
				}else if(Manager.getPassword().equals(password)==false)
				{
					return "base/logout";
				}else{
				
					ArrayList<Manager> list =new ArrayList<Manager>();
					   list.add(Manager);
				model.addAttribute("bestt",list);
			//	request.getSession().setAttribute("Manager", Manager);
				return "base/Manager";
				
				}
			}
			else if(userType.equalsIgnoreCase("Visitor"))
			{
				Visitor Visitor=(Visitor)VisitorService.getVisitor(Integer.parseInt(LoginID));
				if(Visitor==null)
				{
					return "base/Logout";
				}else if(Visitor.getpassword().equals(password)==false)
				
					{
					return "base/logout";
					}
				
				else
					{
					
					ArrayList<Visitor> list =new ArrayList<Visitor>();
					   list.add(Visitor);
					
					model.addAttribute("VisitorList",list);
				request.getSession().setAttribute("Visitor", Visitor);
				return "base/visitorfile";
				
			}
			
			}
			return"getin";
			
			
		}
		
		@RequestMapping(value = "/invalidLogin", method = RequestMethod.GET)
		public String invalidLogin(Model model,HttpServletRequest request) throws Exception {
			return "base/Logout";
		}
	}


