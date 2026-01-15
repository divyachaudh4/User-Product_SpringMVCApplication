package com.soft.service;

import org.springframework.web.servlet.ModelAndView;

import com.soft.model.UserModel;

public interface UserService {
	
	public int newUserService(UserModel userModel );
	public UserModel loginUserService(String userEmail,String password);
}
