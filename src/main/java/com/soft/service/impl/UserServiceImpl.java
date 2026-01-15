package com.soft.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.soft.DAO.UserDao;
import com.soft.model.UserModel;
import com.soft.service.UserService;
@Component
public class UserServiceImpl implements UserService {
    @Autowired
	private UserDao userDao;
    
	@Override
	public int newUserService(UserModel userModel) {
		
		int daoresponse = userDao.newuserDao(userModel);
		return daoresponse ;
		
	}

	@Override
	public UserModel loginUserService(String userEmail, String password) {
		UserModel loginuser= userDao.loginUserDao(userEmail, password);		
		return loginuser;
	}

}
