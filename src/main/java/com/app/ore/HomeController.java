package com.app.ore;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.app.dao.UserService;
import com.app.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);	
	
	@Autowired
	private UserService userService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */

	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
           public String listStudents(Model model) {
		
		
		
		System.out.println("*** USER CONTROLLER FOR /pig");
		try {
			model.addAttribute("User",new User());
		      model.addAttribute("UserList", userService.listuser());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "pig";
	}
	
	@RequestMapping(value = "/Userpart", method = RequestMethod.GET)
    public String listpeople(Model model) {
	
	
	
	System.out.println("*** USER CONTROLLER FOR /pig");
	try {
		model.addAttribute("User",new User());
	      model.addAttribute("UserList", userService.listuser());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "pig";
}
	
	
	
	
		
		@RequestMapping(value="/pigg", method=RequestMethod.POST)
		public String addStudent(@Valid User user,Model model, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				return "pig";
			}
			  System.out.println(user.getUserFirstName());
			  model.addAttribute("User",new User());
		      model.addAttribute("UserList", userService.listuser());
			
		try {
			      userService.addUser(user);
			   
			       
			      
			       
			      model.addAttribute("UserList", userService.listuser());
		          
		          
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			return "display";
		}
		
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	*/
}
