package com.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import java.util.*;

@Controller
@RequestMapping("/greet")
public class SpringController {
	
	@RequestMapping("/hello")
	public ModelAndView greet(){
		
		ModelAndView model = new ModelAndView("welcome");
		
		model.addObject("msg", "hi,there");
		
		return model;
	}
	
	
	@RequestMapping("/hai/{userName}/{firstName}")
	public ModelAndView hai(@PathVariable Map<String,String> pathVars){
		
		String username = pathVars.get("userName");
		String firstname = pathVars.get("firstName");
		
		ModelAndView model = new ModelAndView("hi");
		
		model.addObject("msg","i am learning Spring"+ username + firstname);
		
		return model;
	}

}
