package collectionsff;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serlizationn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	try {
FileOutputStream fos = new FileOutputStream("F:\\Mahhi.txt");
ObjectOutputStream ob = new ObjectOutputStream(fos);
CarsDesign car1= new CarsDesign(1, "Red", 2154, 35, 4, "Inova");
//CarsDesign car2 = new CarsDesign(2, "Black", 2154, 32, 4, "Inova");
ob.writeObject(car1);
//ob.writeObject(car2);
	}catch (Exception ae){
		System.out.println("File not Found");
	}
	}

}
