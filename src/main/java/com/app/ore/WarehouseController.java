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

import com.app.dao.WarehouseService;
import com.app.model.Warehouse;
import com.app.model.Warehouse;

@Controller
public class WarehouseController {
	
	private static final Logger logger = LoggerFactory.getLogger(WarehouseController.class);
	
	
	

	
	
	@Autowired
	private WarehouseService WarehouseService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/warehouse", method = RequestMethod.GET)
           public String listHouse(Model model) {
		
		
		
		System.out.println("*** Warehouse CONTROLLER FOR /pig");
		try {
			model.addAttribute("Warehouse",new Warehouse());
		      model.addAttribute("WarehouseList", WarehouseService.listWarehouse());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Warehouse/house1";
	}
		
		@RequestMapping(value="/addhouse", method=RequestMethod.POST)
		public String addHouse(@Valid Warehouse Warehouse,Model model, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				return "Warehouse/house1";
			}
			  System.out.println(Warehouse.getWarehouseAddress());
			  model.addAttribute("Warehouse",new Warehouse());
		      model.addAttribute("WarehouseList", WarehouseService.listWarehouse());
			
		try {
			      WarehouseService.addWarehouse(Warehouse);
			   
			       
			      
			       
			      model.addAttribute("WarehouseList", WarehouseService.listWarehouse());
		          
		          
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			return "redirect:/warehouse";
		}
		
	
		@RequestMapping(value="/searchhouse")
		public String searchStudent(@RequestParam("id") int id,Model model)
		{
			System.out.print("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
			
			Warehouse specify;
			try {
				specify = WarehouseService.getWarehouse(id);
		
			System.out.print(specify.getWarehouseAddress()+"------------------------");
	   ArrayList<Warehouse> list =new ArrayList<Warehouse>();
			   list.add(specify);
			   Warehouse bb = list.get(0);
			   System.out.print(bb.getWarehouseAddress()+"        llllllllllllllllllllllllll");
			   model.addAttribute("Warehouses",list);
			   model.addAttribute("Warehouse",new Warehouse());
		
			   String map="https://maps.googleapis.com/maps/api/staticmap?center="+
					   specify.getWarehouseAddress()+
					   "&zoom=13&size=600x300&maptype=roadmap"+
					   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
					   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
					   
					   model.addAttribute("map",map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return  "Warehouse/show";
		}
		
		@RequestMapping(value="/deletehouse")
		public String deletehouse(@RequestParam("id") int id,Model model)
		{
			System.out.print("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
			
			WarehouseService.deleteWarehouse(id);
			try {
				model.addAttribute("Warehouse",new Warehouse());
			      model.addAttribute("WarehouseList", WarehouseService.listWarehouse());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Warehouse/house1";
		}
	
	
	
	
	
	

	

}
