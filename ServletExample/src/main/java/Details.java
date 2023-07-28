
public class Details {
private String firstName,lastName, gender,adress, mobileNumber, qualification;

public Details() {
	super();
}

public Details(String firstName, String lastName, String gender, String adress, String mobileNumber,
		String qualification) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.adress = adress;
	this.mobileNumber = mobileNumber;
	this.qualification = qualification;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}


}
