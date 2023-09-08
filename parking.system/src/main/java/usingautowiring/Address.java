package usingautowiring;

public class Address {
	private String village;
	private String town;
	private String state;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", town=" + town + ", state=" + state + "]";
	}
	
	
}
