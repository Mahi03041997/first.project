package methodEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserrralization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//	FileInputStream ff = new FileInputStream("F:\\mahi.text");
		try {
	ObjectInputStream jj = new ObjectInputStream(new FileInputStream("mahi.txt"));
	Studenttt ss = (Studenttt)jj.readObject(); 
	System.out.println( );
		}catch(Exception ee) {
			System.out.println("file not found");
		}

	}

}
