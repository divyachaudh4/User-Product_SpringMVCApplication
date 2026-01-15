package com.soft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soft.DAO.ProductDAO;
import com.soft.model.ProductModel;
import com.soft.service.productService;
@Component
public class ProductServiceImpl implements productService{
    @Autowired
	private ProductDAO productDAO;
	public int addnewService(ProductModel productModel) {
		int responseDAo=productDAO.addnewProductDAO(productModel);
		return responseDAo;
	}

	public List<ProductModel> getallproductService() {
			List<ProductModel> productlist = productDAO.getallproductDAo();
			
			return productlist;
		}

	@Override
	public ProductModel editProductService(int pId) {
		ProductModel respDAO = productDAO.editProductDAO(pId);
		return respDAO;
	
	}

	@Override
	public void updateProduct(ProductModel product) {
		productDAO.updateproductDAO(product);
	}

	@Override
	public void deleteproductService(int pID) {
		productDAO.deleteproductDAO(pID);
		
	}


	
	

}
