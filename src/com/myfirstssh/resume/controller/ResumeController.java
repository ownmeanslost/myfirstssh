package com.myfirstssh.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/resume")
public class ResumeController {

	@RequestMapping("/gotoaddresume")
	public String goToAddResume(){
		
		return  "/resumepage/addresume";
	}
	@RequestMapping("/gotoeditresume")
	public String goToEditResume(){
		
		return "resumepage/editresume";
	}
	
	@RequestMapping("/gotocreateresume")
	public String goToCreateResume(){
		return "resumepage/createresume";
	}
}
