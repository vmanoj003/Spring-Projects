package com.Student;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentSubmissionControll {
	 
	//first request mapping
	@RequestMapping(value="/admissionForm", method = RequestMethod.GET)
	public ModelAndView getAdmission(){
		
		ModelAndView model = new ModelAndView("admissionForm");
		
		return model;
	}
	

	//this is request mapping
	//this is
	@RequestMapping(value="/submitAdmission", method = RequestMethod.POST)
	
	public ModelAndView submitAdmission(@RequestParam Map<String,String> reqparam){
		
		String name = reqparam.get("studentName");
		String hobby = reqparam.get("studentHobby");
		
		ModelAndView model = new ModelAndView("submitAdmission");
		model.addObject("msg","hi,how are you doing"+name+"and your hobby is"+hobby);
		
		return model;
	}

}
