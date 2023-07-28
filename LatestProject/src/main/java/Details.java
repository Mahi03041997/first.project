
public class Details {
private String firstname, lastname,fathername, mothername,gender,dob,educlass,number,email,PaymentOption;

public Details(String firstname, String lastname, String fathername, String mothername, String gender, String dob,
		String educlass, String number, String email, String paymentOption) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.fathername = fathername;
	this.mothername = mothername;
	this.gender = gender;
	this.dob = dob;
	this.educlass = educlass;
	this.number = number;
	this.email = email;
	PaymentOption = paymentOption;
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

public String getEduclass() {
	return educlass;
}

public void setEduclass(String educlass) {
	this.educlass = educlass;
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

public String getPaymentOption() {
	return PaymentOption;
}

public void setPaymentOption(String paymentOption) {
	PaymentOption = paymentOption;
}


}
