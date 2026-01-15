package com.soft.DAO;

import com.soft.model.UserModel;

public interface UserDao {
  public int newuserDao(UserModel userModel );
  public UserModel loginUserDao(String userEmail, String password);
}
