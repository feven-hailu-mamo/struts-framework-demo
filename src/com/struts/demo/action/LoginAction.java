package com.struts.demo.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String userId;
	private String password;
		
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void validate() {
		if(StringUtils.isEmpty(getUserId())) {
			addFieldError("userId","User Id cannot be blank");
		}
       if(StringUtils.isEmpty(getPassword())) {
   		addFieldError("password","Password cannot be blank");
		}
    }

	public String execute() {
		if(getUserId().contentEquals("userId") && getPassword().equals("password"))
			return SUCCESS;
		else
			return LOGIN;
	}
}
