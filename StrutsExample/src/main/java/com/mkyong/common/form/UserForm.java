package com.mkyong.common.form;

import org.apache.struts.action.ActionForm;

import java.util.List;

public class UserForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<UserForm> users;
	String name;
	String email;

	public UserForm() {
	}

	public UserForm(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    public List<UserForm> getUsers() {
        return users;
    }

    public void setUsers(List<UserForm> users) {
        this.users = users;
    }
}
