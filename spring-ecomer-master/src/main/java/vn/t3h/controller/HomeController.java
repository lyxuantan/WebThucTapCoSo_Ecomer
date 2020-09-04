package vn.t3h.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

	static final String VIEW_INDEX = "pages/index";
	


	@GetMapping(value = {"","/"})
	public String getHome(Model model) {
		model.addAttribute("str", "Hello World");
		return VIEW_INDEX;
	}
	
	
}