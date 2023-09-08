package com.newgroup.spring.com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
private int id;
private String name;
private List<String> adress;
private Set<String> phoneNumber;
private Map<String, String> course;
public Employee(int id, String name, List<String> adress, Set<String> phoneNumber, Map<String, String> course) {
	super();
	this.id = id;
	this.name = name;
	this.adress = adress;
	this.phoneNumber = phoneNumber;
	this.course = course;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getAdress() {
	return adress;
}
public void setAdress(List<String> adress) {
	this.adress = adress;
}
public Set<String> getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Set<String> phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", adress=" + adress + ", phoneNumber=" + phoneNumber + ", course="
			+ course + "]";
}

}
