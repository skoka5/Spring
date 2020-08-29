package cm.dxc.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/hello")
public class Hello {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView helloWorld() {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("msg", "Hello World!!!");
		return modelAndView;
		
	}
 
}
