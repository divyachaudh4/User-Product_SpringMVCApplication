package com.soft.service;


import java.util.List;

import com.soft.model.ProductModel;

public interface productService {
	
  public int addnewService(ProductModel productModel );
  public ProductModel editProductService(int pID);
  List<ProductModel> getallproductService();
  void updateProduct(ProductModel product);
  public void deleteproductService(int pID);
  
}
