package com.struts.demo.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts.demo.model.User;
import com.struts.demo.service.LoginService;

public class LoginActionWithModel extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		if(StringUtils.isEmpty(user.getUserId())) {
			addFieldError("userId","User Id cannot be blank");
		}
       if(StringUtils.isEmpty(user.getPassword())) {
   		addFieldError("password","Password cannot be blank");
		}
    }

	public String execute() {
		LoginService loginService = new LoginService();
		boolean result = loginService.verifyLogin(user);
		if(result)
			return SUCCESS;
		else
			return LOGIN;
	}

	@Override
	public User getModel() {
	      return user;
	}
	
}
