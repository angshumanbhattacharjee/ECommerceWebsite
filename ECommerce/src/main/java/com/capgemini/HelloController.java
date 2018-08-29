package com.capgemini;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@RequestMapping("/home")
	public String  hello() {
		return "homepage.jsp";
	}
	
	 
}

