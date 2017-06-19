package com.hp.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hp.bean.User;

public class UserDao {

	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public void add(User user){
		hibernateTemplate.save(user);
		hibernateTemplate.update(user);
		List list=hibernateTemplate.find("from User");
	}
}
