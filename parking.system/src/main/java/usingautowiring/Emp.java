package usingautowiring;

public class Emp {
	private Address address;
	private Qulification qulification;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Qulification getQulification() {
		return qulification;
	}

	public void setQulification(Qulification qulification) {
		this.qulification = qulification;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + ", qulification=" + qulification + "]";
	}

	
	
}
