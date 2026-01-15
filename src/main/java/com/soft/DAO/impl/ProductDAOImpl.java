package com.soft.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.soft.DAO.ProductDAO;
import com.soft.model.ProductModel;

@Repository
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional(readOnly = false)
    public int addnewProductDAO(ProductModel productModel) {
        return (int) hibernateTemplate.save(productModel);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProductModel> getallproductDAo() {
        return hibernateTemplate.loadAll(ProductModel.class);
    }

    @Override
    @Transactional(readOnly = true)
    public ProductModel editProductDAO(int pId) {
        return hibernateTemplate.get(ProductModel.class, pId);
    
    }

    @Override
    @Transactional(readOnly = false)
    public void updateproductDAO(ProductModel product) {
        hibernateTemplate.update(product);
    }

    @Transactional(readOnly = false)
	@Override
	public void deleteproductDAO(int pId) {
		ProductModel product = hibernateTemplate.get(ProductModel.class, pId);
		if(product!=null) {
			hibernateTemplate.delete(product); 	
		
	}
    
	
	}
}

