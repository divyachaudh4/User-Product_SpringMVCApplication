package com.soft.DAO.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.soft.DAO.UserDao;
import com.soft.model.UserModel;
@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate  hibernateTemplate;

    @Transactional
	@Override
	public int newuserDao(UserModel userModel) {
	    
		int DbResp = (int) hibernateTemplate.save(userModel);
		return DbResp;
		
	}

	@Override
	public UserModel loginUserDao(String userEmail, String password) {
		 String hql = "FROM UserModel u WHERE u.userEmail = :userEmail AND u.password = :password";

		    List<UserModel> users = (List<UserModel>) hibernateTemplate.findByNamedParam(
		            hql,
		            new String[]{"userEmail", "password"},
		            new Object[]{userEmail, password}
		    );

		    return users.isEmpty() ? null : users.get(0);
	}
}
