package com.dxc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.model.Student;

@Controller
public class StudentAdmissionController {
	
	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		modelAndView.addObject("stud1", new Student());
		return modelAndView;
	}

	@RequestMapping(value="/SubmitAdmisssion.html" , method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("stud1") Student stud1) {
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess","stud1", stud1);
			
		return modelAndView;
	}
}
