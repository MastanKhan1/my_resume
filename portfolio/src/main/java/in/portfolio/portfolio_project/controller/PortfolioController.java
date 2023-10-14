package in.portfolio.portfolio_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import in.portfolio.portfolio_project.entity.User;
import in.portfolio.portfolio_project.service.MyService;

@Controller
public class PortfolioController {

	
	@Autowired
	private MyService service;
	
	@GetMapping("/home")
	public String toHome() {
		return "home";
	}
	
	@GetMapping("/about_me")
	public String toAboutMe() {
		return "about_me";
	}
	
	@GetMapping("/contact")
	public String toContact() {
		return "contact";
	}
	
	
	
	
	@GetMapping("/projects")
	public String toProjects() {
		return "projects";
	}
	

	
	@GetMapping("/save")
	public String saveData(@ModelAttribute User user) {
		service.saveInfo(user);
		return "redirect:/home";
	}
	
	
}
