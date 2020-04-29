package com.struts.demo.service;

import com.struts.demo.model.User;

public class LoginService {

	public boolean verifyLogin(User user) {
		if(user.getUserId().equals("userId") &&
				user.getPassword().equals("password"))
		   return true;
		else
			return false;
	}
}
