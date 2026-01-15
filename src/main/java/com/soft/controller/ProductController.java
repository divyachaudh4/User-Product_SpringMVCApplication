package com.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soft.model.ProductModel;
import com.soft.service.productService;

@Controller
public class ProductController {
	@Autowired
	private productService productService ;
	
	@RequestMapping("/addnewproduct")
	public String addNewProduct(@ModelAttribute ProductModel productModel ) {
		
		int response = productService.addnewService(productModel);
		
		if(response<1) {
			return "error";
		}else {
		
		return "redirect:/findallProduct";
		
	     }
	}
	
	@RequestMapping("/findallProduct")
	public ModelAndView getallProduct() {
		
		ModelAndView mav = new ModelAndView();
		
		List<ProductModel> allproductlist = productService.getallproductService();
		mav.addObject("addproduct", allproductlist);
		mav.setViewName("userdashboard");
		return mav;
	}
	@RequestMapping("/editProduct")
	public ModelAndView editProduct(@RequestParam("pId") int pId) {
		
		 ProductModel product = productService.editProductService(pId);
		 System.out.println(pId);
		 ModelAndView mav = new ModelAndView("editProduct");
		 mav.addObject("product",product);
		 return mav;
	     }
	
	@RequestMapping("/updateProduct")
	public String updateProduct(@ModelAttribute("product") ProductModel productModel ) {
	 
		productService.updateProduct(productModel);
		return "redirect:/findallProduct";
	}
	
	@RequestMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("pId") int pId ) {
		productService.deleteproductService(pId);
		return "redirect:/findallProduct";
		
}
}
