package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Usedtls;
import com.example.demo.services.UserService;


//@RestController
@Controller
@RequestMapping("/")
public class HomeControler {
	
	@Autowired
	private UserService userService;
	
//	@GetMapping("/home")
//	public ModelAndView home() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("home");
//				
//		return modelAndView;
//	}
	
	
	
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
				
		return modelAndView;
	}
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
				
		return modelAndView;
	}
	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");
				
		return modelAndView;
	}
//   @GetMapping("/home2")
//   public String home(){
//	   return "home2.html";
//    }
//	
// 
//   
//   @GetMapping("/login")
//	public String login() {
//      return "/login";
//	}
//	
//   @GetMapping("/register")
//    public String register(){
//		   return "/register";
//	   }
//	
//	@PostMapping("/createUser")
//	public String createuser(@ModelAttribute Usedtls user) {
//		
//		Usedtls userDtals= userService.createUser(user);
//		
//		
//		if(userDtals !=null)
//		{
//			System.out.println("registerd Sucessfully");
//		}else {
//			System.out.println("something error in server");
//		}
//		
//	return 	"register";
//		
//	}
}