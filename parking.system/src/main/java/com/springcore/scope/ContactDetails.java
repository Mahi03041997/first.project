package com.springcore.scope;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ContactDetails {
	@Value("#{phn}")
private List<Long> phoneNumber;
	@Value("#{email}")
private Set<String> email;
public ContactDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public List<Long> getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(List<Long> phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Set<String> getEmail() {
	return email;
}
public void setEmail(Set<String> email) {
	this.email = email;
}
@Override
public String toString() {
	return "ContactDetails [phoneNumber=" + phoneNumber + ", email=" + email + "]";
}

}
