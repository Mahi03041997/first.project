package com.list.standlone;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private List<String>name;
	@Autowired
	private Contact contact;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public List<String> getName() {
		return name;
	}


	public void setName(List<String> name) {
		this.name = name;
	}


	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", contact=" + contact + "]";
	}
	@PostConstruct
	public void instalize() {
		System.out.println("init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method ");
	}
}
