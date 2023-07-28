package collectionsff;

public class Mahiiiii {
	int carId;
	String colour;
	int engineNumber;
	int count;
	int noOfSeats;
	String companyName;
	 Mahiiiii(int carId, String colour, int engineNumber, int count, int noOfSeats, String companyName) {
		super();
		this.carId = carId;
		this.colour = colour;
		this.engineNumber = engineNumber;
		this.count = count;
		this.noOfSeats = noOfSeats;
		this.companyName = companyName;
		
	 }
	 void details() {
			System.out.println("Name of the Company : "+companyName+"\n number of cars in the company : "+count+"\n  car id  : "+carId+"\n  Colour of the Car : "+colour+"\n  Number of Seats :  "+noOfSeats+"\n  engineNumber : "+engineNumber);
		}

}
