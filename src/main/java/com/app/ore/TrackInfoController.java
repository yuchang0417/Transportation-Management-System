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

import com.app.dao.TrackinfoService;
import com.app.model.Trackinfo;
import com.app.model.Trackinfo;

@Controller
public class TrackInfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(TrackInfoController.class);
	
	
	

	
	
	@Autowired
	private TrackinfoService TrackinfoService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/Trackinfo", method = RequestMethod.GET)
           public String listHouse(Model model) {
		
		
		
		System.out.println("*** Trackinfo CONTROLLER FOR /pig");
		try {
			  model.addAttribute("Trackinfo",new Trackinfo());
		      model.addAttribute("TrackinfoList", TrackinfoService.listTrackinfo());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Trackinfo/track";
	}
		
		@RequestMapping(value="/addtrack", method=RequestMethod.POST)
		public String addHouse(@Valid Trackinfo Trackinfo,Model model, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				return "Trackinfo/track";
			}
			  System.out.println(Trackinfo.getStatus());
			  model.addAttribute("Trackinfo",new Trackinfo());
		      model.addAttribute("TrackinfoList", TrackinfoService.listTrackinfo());
			
		try {
			      TrackinfoService.addTrackinfo(Trackinfo);
			   
			       
			      
			       
			      model.addAttribute("TrackinfoList", TrackinfoService.listTrackinfo());
		          
		          
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
			
			return "redirect:/Trackinfo";
		}
		
		@RequestMapping(value="/searcTrack")
		public String searchStudent(@RequestParam("id") int id,Model model)
		{
			System.out.print("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
			
			Trackinfo specify;
			try {
				specify = TrackinfoService.getTrackinfo(id);
	
			System.out.print(specify.getStatus()+"------------------------");
	   ArrayList<Trackinfo> list =new ArrayList<Trackinfo>();
			   list.add(specify);
			   Trackinfo bb = list.get(0);
			   System.out.print(bb.getTrackDate()+"        llllllllllllllllllllllllll");
			   model.addAttribute("Trackinfos",list);
			   model.addAttribute("Trackinfo",new Trackinfo());
		
			   String map="https://maps.googleapis.com/maps/api/staticmap?center="+
					   specify.getStatus()+
					   "&zoom=13&size=600x300&maptype=roadmap"+
					   "&markers=color:blue%7Clabel:S%7C40.702147,-74.015794&markers=color:green%7Clabel:G%7C40.711614,-74.012318"+
					   "&markers=color:red%7Clabel:C%7C40.718217,-73.998284&key=AIzaSyAjSIdmLjyNifNsBs6IZyOR2JgHhgCd8TI";
					   
					   model.addAttribute("map",map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			return  "Trackinfo/show";
		}
	
	
	
	
	
	
	
	

	

}