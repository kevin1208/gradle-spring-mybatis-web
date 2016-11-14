package com.kevin.user.service;

import com.kevin.user.model.UserDTO;

public interface UserService {

	public UserDTO getUserById(int userId);
	 
	 public int register(UserDTO user);
	 
	 public UserDTO login(UserDTO user);
}
