package methodEx;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Seriiilization {
	static ObjectOutputStream oo;
	static FileOutputStream fff ;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
Studenttt mahi = new Studenttt("Mahi Rajput", 20, 75, "Mangal Singh") ;
System.out.println(mahi);
try {
fff = new FileOutputStream("F:\\mahi.text");
 oo = new ObjectOutputStream(fff);
 oo.writeObject(mahi);
}catch(Exception e) {
	System.out.println("file not created");
}
finally {
	fff.close();
	oo.close();
	}
}

}
