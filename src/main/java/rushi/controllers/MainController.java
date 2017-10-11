package rushi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	public MainController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Returns list of all chips.
	@RequestMapping(value="/", method=RequestMethod.GET, produces = "application/json")
	public String goToLogin() {
		String responseJSON = "";
		try {
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return responseJSON;
	} 
}
