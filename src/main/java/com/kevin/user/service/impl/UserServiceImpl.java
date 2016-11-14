package com.kevin.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.user.dao.UserMapper;
import com.kevin.user.model.UserDTO;
import com.kevin.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDTO getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public int register(UserDTO user) {
		return userMapper.insert(user);
	}

	@Override
	public UserDTO login(UserDTO user) {
		return userMapper.userLogin(user);
	}

}
