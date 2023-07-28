package oop.concepts;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	
	
	public static void main(String[] args) throws IOException {
	
		Employee emp = new Employee(101,"Sriram");
		FileOutputStream fos = null;
		ObjectOutputStream oos= null;

		try {
			
		    fos = new FileOutputStream("C:\\Users\\AA\\OneDrive\\Desktop\\Ser\\Employee.txt");
	        oos = new ObjectOutputStream(fos);
	        oos.writeObject(emp);	
	        
	        System.out.println("Serialization Completed");
	        
		}
		finally{
			
			fos.close();
			oos.close();
			
		}
				
	}
	
	

}
