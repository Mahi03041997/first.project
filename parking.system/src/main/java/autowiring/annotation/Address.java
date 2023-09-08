package autowiring.annotation;

public class Address {
private String village;
private String state;
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String village, String state) {
	super();
	this.village = village;
	this.state = state;
}
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [village=" + village + ", state=" + state + "]";
}

}
