package com.app.ore;


import java.io.IOException;

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


import com.app.dao.VisitorService;
import com.app.model.Visitor;



@Controller

public class VisitorController 
{
	
	
	private static final Logger logger = LoggerFactory.getLogger(VisitorController.class);
	
	
	@Autowired
	private VisitorService VisitorService;
	
	@RequestMapping(value="/submitVisitor",method=RequestMethod.POST)
	public String addVisitor(@Valid Visitor Visitor, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("VisitorList", VisitorService.listVisitor());
			model.addAttribute("Visitor",new Visitor());
			return "base/visitor";
		}
		VisitorService.addVisitor(Visitor);
		model.addAttribute("VisitorList", VisitorService.listVisitor());
		return "base/visitorfile";
	}
	
	@RequestMapping(value="/Visitor",method=RequestMethod.GET)
	public String listVisitor(Model model) 
	{
		model.addAttribute("Visitor",  new Visitor());
		model.addAttribute("VisitorList", VisitorService.listVisitor());
		return "base/visitor";
	}
	

	}
