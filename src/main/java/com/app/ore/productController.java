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


import com.app.dao.productService;
import com.app.model.product;



@Controller

public class productController 
{
	
	
	private static final Logger logger = LoggerFactory.getLogger(productController.class);
	
	
	@Autowired
	private productService productService;
	
	@RequestMapping(value="/submitproduct",method=RequestMethod.POST)
	public String addproduct(@Valid product product, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("productList", productService.listproduct());
			return "product/product0";
		}
		productService.addproduct(product);
		return "redirect:/product";
	}
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String listproduct(Model model) 
	{
		model.addAttribute(new product());
		model.addAttribute("productList", productService.listproduct());
		return "product/product0";
	}
	
	@RequestMapping(value="/{Id}/photo", method=RequestMethod.GET)
	public @ResponseBody String viewPhoto12(@PathVariable int Id, HttpServletResponse response) throws IOException {
		product product = productService.getproduct(Id);
		byte[] photoBytes = product.getPhotoBytes();
		if (photoBytes != null) {
			int photoLength = photoBytes.length;
			try (ServletOutputStream sos = response.getOutputStream()) {
				response.setContentType(product.getPhotoContentType());
				response.setContentLength(photoLength);
				response.setHeader("Content-Disposition", "inline; filename=\"" + product.getPhotoFilename() + "\"");
				
				sos.write(photoBytes);
				sos.flush();
			}
		}
		return "";
	}
	
	@RequestMapping(value="/{Id}", method=RequestMethod.DELETE)
	public @ResponseBody String deleteproduct(@PathVariable int Id) {
		productService.deleteproduct(Id);
		
		return "";
	}
}