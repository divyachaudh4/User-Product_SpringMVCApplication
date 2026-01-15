package com.soft.DAO;

import java.util.List;

import com.soft.model.ProductModel;

public interface ProductDAO {
	public int addnewProductDAO(ProductModel productModel);
	public List<ProductModel> getallproductDAo();
	public ProductModel editProductDAO(int pId);
	public void updateproductDAO(ProductModel product);
	public void deleteproductDAO(int pId);

}
