package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.PersonService;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping
	public String hello(){
		return "index";
	}

	@RequestMapping("/add")
	public String addPerson() {
		personService.addPerson();
		return "success";
	}
	
}
