package com.myfirstssh.book.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


import com.myfirstssh.book.service.BookService;

@Controller
@RequestMapping("/BookDemo")
public class BookDemoController {
	
	@Autowired
	BookService bookService;
	@RequestMapping(value="/SayHello")
	public String sayHello(){
		bookService.get(20);
		
		return "/index";
	}
}
