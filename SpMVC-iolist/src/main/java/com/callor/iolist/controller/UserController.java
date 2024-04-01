package com.callor.iolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.iolist.models.UserDto;
import com.callor.iolist.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value="/user")
public class UserController {
	private final UserService userService;
	public UserController(UserService userService) {
		// TODO Auto-generated constructor stub
		this.userService = userService;
	}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getUser() {
		return null;
	}
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join(Model model) {
		UserDto user = userService.getUser();
		model.addAttribute("USER",user);
		return null;
	}
	
	public String join(UserDto userDto) {
		log.debug("데이터 {} ",userDto.toString());
		return null;
	}

}
