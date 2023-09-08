package com.spring.ref;

public class Address {
private String h_no;
private String street;
private String village;
private String town;
private String district;
public Address(String h_no, String street, String village, String town, String district) {
	super();
	this.h_no = h_no;
	this.street = street;
	this.village = village;
	this.town = town;
	this.district = district;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public String getH_no() {
	return h_no;
}
public void setH_no(String h_no) {
	this.h_no = h_no;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public String getTown() {
	return town;
}
public void setTown(String town) {
	this.town = town;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
@Override
public String toString() {
	return "Address [h_no=" + h_no + ", street=" + street + ", village=" + village + ", town=" + town + ", district="
			+ district + "]";
}

}
