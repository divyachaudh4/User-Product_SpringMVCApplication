package com.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soft.model.UserModel;
import com.soft.service.UserService;
@Controller
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping("/saveuser")
	public ModelAndView createNewUSer(@ModelAttribute UserModel userModel ) {
		ModelAndView mav = new ModelAndView();
		int response =  userService.newUserService(userModel);
		mav.setViewName("UserLogin");
		return mav;
		
	}
	
	@RequestMapping("/login")
	public String userLogin(@RequestParam String userEmail, @RequestParam String password) {
		UserModel loginuser = userService.loginUserService(userEmail, password);
		
		if(loginuser != null) {
			return "redirect:/findallProduct";
		}else {
			return "error";
		}
	}

}
