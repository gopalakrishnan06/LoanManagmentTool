package LoanManagmentTool.LoanManagmentTool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexPageController {

	
	@RequestMapping("/Welcome")
	ModelAndView welcome(){
		ModelAndView model=new ModelAndView();
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping("/Wel")
	String welcomeString(){
		return "home";
	}
}
