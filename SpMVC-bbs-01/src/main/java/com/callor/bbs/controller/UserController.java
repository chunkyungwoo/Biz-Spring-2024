package com.callor.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		// reurn "user/join";
		return null;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		// reurn "user/login";
		return null;
	}

}
