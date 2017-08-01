package com.myfirstssh.book.controller;




import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/BookDemo")
public class BookDemoController {

	/**
	 * 跳转专用
	 * @return
	 */
	@RequestMapping(value="/SayHello")
	public String sayHello(){
		
		
		return "/index";
	}
}
