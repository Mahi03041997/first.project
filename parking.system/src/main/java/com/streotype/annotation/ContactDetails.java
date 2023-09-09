package com.streotype.annotation;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ContactDetails {
	@Value("9110771054")
private Long phoneNumber;
	@Value("#{mapemail}")
private Map<String, String> email;

public ContactDetails(Long phoneNumber, Map<String,String> email) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
public ContactDetails() {
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
	return " [phoneNumber=" + phoneNumber + ", email=" + email + "]";
}

}
