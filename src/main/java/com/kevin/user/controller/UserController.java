package com.kevin.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kevin.user.model.UserDTO;
import com.kevin.user.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	protected UserDTO login(HttpServletRequest request, @RequestBody UserDTO user) {
		System.out.println(user);
		return userService.login(user);
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	protected UserDTO register(HttpServletRequest request, @RequestBody UserDTO user) {
		System.out.println(user);
		userService.register(user);
		return user;
	}
	
	@ResponseBody
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	protected UserDTO queryById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public String exception(Exception e) {
		System.out.println(e.getMessage());
		return e.getMessage();
	}
}
