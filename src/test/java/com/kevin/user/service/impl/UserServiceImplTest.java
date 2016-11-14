package com.kevin.user.service.impl;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kevin.user.model.UserDTO;
import com.kevin.user.service.UserService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceImplTest {
	
	@Autowired
	private UserService userService;

	@Test
	public void testRegister() {
		UserDTO user = new UserDTO();
		user.setUserName("ÑîÉÙ¿­");
		user.setPassWord("kevin1208");
		user.setAge(28);
		user.setBirthday(new Date(System.currentTimeMillis()));
		user.setSex("ÄÐ");
		userService.register(user);
	}

	@Test
	public void testGetUserById() {
		
		System.out.println("testGetUserById:" + userService.getUserById(38));
	}

	@Test
	public void testLogin() {
		UserDTO user = new UserDTO();
		user.setUserName("ÑîÉÙ¿­");
		user.setPassWord("kevin1208");
		
		System.out.println("testLogin:" + userService.login(user));
	}

}
