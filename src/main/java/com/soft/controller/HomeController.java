package com.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
  @RequestMapping("/homepage")	
  public  String home(){
	  return "home";  
  }
  
  @RequestMapping("/adduser")
  public String UserRegister() {
	  return "userform";
  }
  
  @RequestMapping("/userlogin")
  public String UserLogin() {
	  return "UserLogin";
  }
  
  @RequestMapping("/newProductform")
  public String newProduct() {
	return "addnewproduct";  
	  
	  
  }
}
