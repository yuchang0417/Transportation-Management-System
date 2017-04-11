package com.app.ore;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.app.dao.ManagerService;
import com.app.model.Manager;
import com.app.model.Manager;
import com.app.dao.*;





@Controller

public class ManagerController 
{
	
	
	private static final Logger logger = LoggerFactory.getLogger(ManagerController.class);
	
	
	@Autowired
	private ManagerService ManagerService;
	
	
	@Autowired
	private VisitorService VisitorService;
	

	
	@RequestMapping(value="/manager",method=RequestMethod.GET)
	public String listManager(Model model) 
	{
		model.addAttribute("Manager",new Manager());
		
		return "base/addManager";
	}
	
	
	
	@RequestMapping(value="/goudai",method=RequestMethod.POST)//bixu 由post 改成get, 不然屁都没
	public String addManager(@Valid Manager Manager, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute(new Manager());
			return "base/addManager";
		}
	//	List<Manager> ManagerList;
		
		ManagerService.addManager(Manager);
		model.addAttribute("ManagerList", ManagerService.listManager());
		
		
		

		
		return "base/Manager";
	}
	
	

	
	@RequestMapping(value="/{Id}/photo1", method=RequestMethod.GET)
	public @ResponseBody String viewPhoto12(@PathVariable int Id, HttpServletResponse response) throws IOException {
		System.out.println("debug+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Manager Manager = ManagerService.getManager(Id);
		byte[] photoBytes = Manager.getPhotoBytes();
		System.out.println(Manager.getManagerName()+ "tanlande bichiddddddddddddddddddddddddddddddddddddddddddddddddddddddddd;");
		if (photoBytes != null) {
			int photoLength = photoBytes.length;
			try (ServletOutputStream sos = response.getOutputStream()) {
				response.setContentType(Manager.getPhotoContentType());
				response.setContentLength(photoLength);
				response.setHeader("Content-Disposition", "inline; filename=\"" + Manager.getPhotoFilename() + "\"");
				
				sos.write(photoBytes);
				sos.flush();
			}
		}
		return "";
	}
	
	
}