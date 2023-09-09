package autowiring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
private String name;
@Autowired
@Qualifier("address1")
private Address address;
@Autowired
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
@PostConstruct
public void init() {
	System.out.println("initr method");
}
@PreDestroy
public void destroy() {
	System.out.println("destroy method");
}

}
