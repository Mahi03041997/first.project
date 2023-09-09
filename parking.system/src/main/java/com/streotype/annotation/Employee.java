package com.streotype.annotation;

import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Employee {
	@Value("#{setname}")
	private Set<String> name;
	@Value("#{listFatherName}")
	private List<String> fatherName;
	@Autowired
	private ContactDetails contactDetails;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Set<String> name, List<String> fatherName, ContactDetails contactDetails) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.contactDetails = contactDetails;
	}
	

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Set<String> getName() {
		return name;
	}
	public void setName(Set<String> name) {
		this.name = name;
	}
	public List<String> getFatherName() {
		return fatherName;
	}
	public void setFatherName(List<String> fatherName) {
		this.fatherName = fatherName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", fatherName=" + fatherName + ", contactDetails=" + contactDetails + "]";
	}
	@PostConstruct
	public void welcome() {
		System.out.println("you are well come to our area");
	}
	@PreDestroy
	public void sendoff() {
		System.out.println("please visit again");
	}
	
}
