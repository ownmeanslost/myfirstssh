package com.myfirstssh.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginDrumpController {
	
	@RequestMapping("/Login")
	public String Login(){
		
		return "/homepage/HomePage";
	}

}
