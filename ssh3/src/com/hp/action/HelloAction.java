package com.hp.action;


import com.hp.bean.User;
import com.hp.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	private UserDao dao;
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	public String hello(){
		User user=new User();
		user.setId(1);
		user.setName("abc");
		dao.add(user);
		return SUCCESS;
	}
}
