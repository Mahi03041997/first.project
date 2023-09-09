package com.list.standlone;

import java.util.Map;

public class Contact {
	private Long phoneNumber;
	
	private Map<String, String> email;
	
	public Contact(Long phoneNumber, Map<String, String> email) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Map<String, String> getEmail() {
		return email;
	}
	public void setEmail(Map<String, String> email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

}
