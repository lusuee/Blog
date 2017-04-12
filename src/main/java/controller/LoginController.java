package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping
	public String login() {
		return "/login/login";
	}
	
	@ModelAttribute
	@RequestMapping("register")
	public void register(String lastname, String email, Model model){
		model.addAttribute("view", "success");
	}
	
	@RequestMapping("dologin")
	public String doLogin() {
		return "success";
	}
	
}
