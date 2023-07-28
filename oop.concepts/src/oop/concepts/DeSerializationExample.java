package oop.concepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee emp = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
		fis = new FileInputStream("C:\\Users\\AA\\OneDrive\\Desktop\\Ser\\Employee.txt");
			 ois = new ObjectInputStream(fis);
			  emp = (Employee)ois.readObject();
			  
			
			  System.out.println(emp);
			
		}
		finally{
			
			ois.close();
			fis.close();
		}
		
		
	}

}
