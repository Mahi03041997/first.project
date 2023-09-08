package autowiring.annotation;

public class ContactDetails {
private int phoneNumber;
private String email;
public ContactDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public ContactDetails(int phoneNumber, String email) {
	super();
	this.phoneNumber = phoneNumber;
	this.email = email;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "ContactDetails [phoneNumber=" + phoneNumber + ", email=" + email + "]";
}

}
