package com.app.ore;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.UserService;
import com.app.model.User;

import strong.app.UsersDao;




@Controller
public class finUserController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);	
	
	@Autowired
	private UsersDao userDao;
	
	
	@Autowired
	private UserService userService;
	@RequestMapping(value="/showStudent")
	public String searchUser(@RequestParam("id") int id,Model model)
	{
		System.out.print("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
		
		User specify;
		try {
			specify = userService.getUser(id);
	       // specify = userDao.queryUserById(id);
	        
		System.out.print(specify.getUserStreet()+"------------------------");
   ArrayList<User> list =new ArrayList<User>();
		   list.add(specify);
		   User bb = list.get(0);
		   System.out.print(bb.getUserEmail()+"        llllllllllllllllllllllllll");
		   model.addAttribute("Users",list);
		   model.addAttribute("User",new User());
	
		   String map="https://maps.googleapis.com/maps/api/staticmap?center="+
				   specify.getUserStreet()+
				   "&zoom=13&size=600x300&maptype=roadmap"+
				   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
				   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
				   
				   model.addAttribute("map",map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return  "User/show";
	}
	
	@RequestMapping(value="/delete")
	public String deleteUser(@RequestParam("id") int id,Model model)
	{
		System.out.print("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
		
		userService.deleteUser(id);
		try {
			model.addAttribute("User",new User());
		      model.addAttribute("UserList", userService.listuser());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "pig";
	}
	
	@RequestMapping(value = "/beginstu", method = RequestMethod.GET)
    public String killUsers(Model model) {
	
	
	
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
	
	
}
