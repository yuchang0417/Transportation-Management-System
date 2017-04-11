package com.app.ore;

import java.util.ArrayList;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.OrderService;
import com.app.model.Order;

@Controller
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	
	

	
	
	@Autowired
	private OrderService OrderService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/Order", method = RequestMethod.GET)
           public String listorder(Model model) {
		
		
		
		System.out.println("*** Order CONTROLLER FOR /pig");
		try {
			model.addAttribute("Order",new Order());
		      model.addAttribute("OrderList", OrderService.listOrder());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Order/order1";
	}
	
	@RequestMapping(value = "/exactSearch", method = RequestMethod.GET)
    public String Searchorder(Model model) {
	
	
	return "Order/exactSearch";
}
	
	@RequestMapping(value = "/findOrder", method = RequestMethod.GET)
    public String Findorder(Model model) {
	
	
	return "Order/theSearch";
}
	
	@RequestMapping(value = "/searchResult", method = RequestMethod.POST)
    public String SearchResult(String ID, Model model) {
	System.out.print(ID+"?????????????????????????????????????????????");
	
	Order specify;
	try {
		specify = OrderService.getOrder(Integer.parseInt(ID));

	
ArrayList<Order> list =new ArrayList<Order>();
	   list.add(specify);
	   Order Account = list.get(0);
	 
	   System.out.print(Account.getReceiver().getUser().getUserStreet()+"        llllllllllllllllllllllllll");
	   model.addAttribute("Orders",list);
	   model.addAttribute("OrderList", OrderService.listOrder());


	   String map1="https://maps.googleapis.com/maps/api/staticmap?center="+
			   specify.getSender().getUser().getUserStreet()+
			   "&zoom=13&size=600x300&maptype=roadmap"+
			   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
			   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
			   
			   model.addAttribute("map1",map1);
			   
			   String map2="https://maps.googleapis.com/maps/api/staticmap?center="+
					   specify.getTrackinfo().getStatus()+
					   "&zoom=13&size=600x300&maptype=roadmap"+
					   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
					   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
					   
					   model.addAttribute("map2",map2);	   
			   
					   String map3="https://maps.googleapis.com/maps/api/staticmap?center="+
							   specify.getReceiver().getUser().getUserStreet()+
							   "&zoom=13&size=600x300&maptype=roadmap"+
							   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
							   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
							   
							   model.addAttribute("map3",map3);	
							   
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	return  "Order/showresult";
}
	
	
		/*
		@RequestMapping(value="/addorder", method=RequestMethod.POST)
		public String addorder(@Valid Order Order,Model model, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				return "Order/order1";
			}
			  System.out.println(Order.getTrackinfo().getStatus());
			  model.addAttribute("Order",new Order());
		      model.addAttribute("OrderList", OrderService.listOrder());
			
		try {
			      OrderService.addOrder(Order);
			   
			       
			      
			       
			      model.addAttribute("OrderList", OrderService.listOrder());
		          
		          
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			return "redirect:/Order";
		}
		*/
	
		@RequestMapping(value="/displayorder")
		public String searchOrder1(@RequestParam("id") int id,Model model)
		{
			System.out.print("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
			
			Order specify;
			try {
				specify = OrderService.getOrder(id);
	
			
	   ArrayList<Order> list =new ArrayList<Order>();
			   list.add(specify);
			   Order Account = list.get(0);
			 
			   System.out.print(Account.getReceiver().getUser().getUserStreet()+"        llllllllllllllllllllllllll");
			   model.addAttribute("Orders",list);
			   model.addAttribute("OrderList", OrderService.listOrder());
		
		
			   String map1="https://maps.googleapis.com/maps/api/staticmap?center="+
					   specify.getSender().getUser().getUserStreet()+
					   "&zoom=13&size=600x300&maptype=roadmap"+
					   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
					   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
					   
					   model.addAttribute("map1",map1);
					   
					   String map2="https://maps.googleapis.com/maps/api/staticmap?center="+
							   specify.getTrackinfo().getStatus()+
							   "&zoom=13&size=600x300&maptype=roadmap"+
							   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
							   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
							   
							   model.addAttribute("map2",map2);	   
					   
							   String map3="https://maps.googleapis.com/maps/api/staticmap?center="+
									   specify.getReceiver().getUser().getUserStreet()+
									   "&zoom=13&size=600x300&maptype=roadmap"+
									   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
									   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
									   
									   model.addAttribute("map3",map3);	
									   
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return  "Order/dislpay";
		}
		
		@RequestMapping(value="/deleteorder")
		public String deleteorder(@RequestParam("id") int id,Model model)
		{
			System.out.print("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
			
			OrderService.deleteOrder(id);
			try {
				model.addAttribute("Order",new Order());
			      model.addAttribute("OrderList", OrderService.listOrder());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Order/dislpay";
		}
	
		
		@RequestMapping(value = "/showme", method = RequestMethod.POST)
	    public String customerfind(String ID, Model model) {
		System.out.print(ID+"?????????????????????????????????????????????");
		
		Order specify;
		try {
			specify = OrderService.getOrder(Integer.parseInt(ID));

		
	ArrayList<Order> list =new ArrayList<Order>();
		   list.add(specify);
		   Order Account = list.get(0);
		 
		   System.out.print(Account.getReceiver().getUser().getUserStreet()+"        llllllllllllllllllllllllll");
		   model.addAttribute("Orders",list);
		   model.addAttribute("OrderList", OrderService.listOrder());


		   String map1="https://maps.googleapis.com/maps/api/staticmap?center="+
				   specify.getSender().getUser().getUserStreet()+
				   "&zoom=13&size=600x300&maptype=roadmap"+
				   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
				   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
				   
				   model.addAttribute("map1",map1);
				   
				   String map2="https://maps.googleapis.com/maps/api/staticmap?center="+
						   specify.getTrackinfo().getStatus()+
						   "&zoom=13&size=600x300&maptype=roadmap"+
						   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
						   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
						   
						   model.addAttribute("map2",map2);	   
				   
						   String map3="https://maps.googleapis.com/maps/api/staticmap?center="+
								   specify.getReceiver().getUser().getUserStreet()+
								   "&zoom=13&size=600x300&maptype=roadmap"+
								   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
								   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
								   
								   model.addAttribute("map3",map3);	
								   
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return  "Order/onlyone";
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	