package autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
private String name;
private Address address;
private ContactDetails contactdetails;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(String name, Address address, ContactDetails contactdetails) {
	super();
	this.name = name;
	this.address = address;
	this.contactdetails = contactdetails;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public ContactDetails getContactdetails() {
	return contactdetails;
}
public void setContactdetails(ContactDetails contactdetails) {
	this.contactdetails = contactdetails;
}
@Override
public String toString() {
	return "Emp [name=" + name + "," + address + ", " + contactdetails + "]";
}


}
