package com.springcore.scope;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("#{studentName}")
private Set<String> name;
@Autowired
private Education education;
@Autowired
private TakenCourse takencourse;
@Autowired
private ContactDetails contactdetails;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(Set<String> name, Education education, TakenCourse takencourse, ContactDetails contactdetails) {
	super();
	this.name = name;
	this.education = education;
	this.takencourse = takencourse;
	this.contactdetails = contactdetails;
}

public Set<String> getName() {
	return name;
}

public void setName(Set<String> name) {
	this.name = name;
}

public Education getEducation() {
	return education;
}

public void setEducation(Education education) {
	this.education = education;
}

public TakenCourse getTakencourse() {
	return takencourse;
}

public void setTakencourse(TakenCourse takencourse) {
	this.takencourse = takencourse;
}

public ContactDetails getContactdetails() {
	return contactdetails;
}

public void setContactdetails(ContactDetails contactdetails) {
	this.contactdetails = contactdetails;
}

@Override
public String toString() {
	return "Student [name=" + name + ", education=" + education + ", takencourse=" + takencourse + ", contactdetails="
			+ contactdetails + "]";
}
@PostConstruct
public void init() {
	System.out.println("starting point");
}
@PreDestroy
public void destroy() {
	System.out.println("ending point");
}


}
