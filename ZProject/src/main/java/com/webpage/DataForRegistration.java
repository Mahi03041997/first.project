package com.webpage;

public class DataForRegistration {
private String  firstname,lastname,fathername,mothername,gender,dob,number,email,adhar,adress,password,payment;

public DataForRegistration(String firstname, String lastname, String fathername, String mothername, String gender,
		String dob, String number, String email, String adhar, String adress,String payment, String password) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.fathername = fathername;
	this.mothername = mothername;
	this.gender = gender;
	this.dob = dob;
	this.number = number;
	this.email = email;
	this.adhar = adhar;
	this.adress = adress;
	this.password = password;
	this.payment = payment;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getFathername() {
	return fathername;
}

public void setFathername(String fathername) {
	this.fathername = fathername;
}

public String getMothername() {
	return mothername;
}

public void setMothername(String mothername) {
	this.mothername = mothername;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAdhar() {
	return adhar;
}

public void setAdhar(String adhar) {
	this.adhar = adhar;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPayment() {
	return payment;
}

public void setPayment(String payment) {
	this.payment = payment;
}


}
