package loops;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Dees {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
FileInputStream ff = new FileInputStream("F:\\Mahhi.txt");
ObjectInputStream on = new ObjectInputStream(ff);
CarsDesign dd = (CarsDesign) on.readObject();
dd.Details();
	
	}

}
