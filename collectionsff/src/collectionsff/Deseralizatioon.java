package collectionsff;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deseralizatioon {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
FileInputStream fs = new FileInputStream("F:\\\\Mahhi.txt");
ObjectInputStream obj = new ObjectInputStream(fs);
Object obb = obj.readObject();
Mahiiiii mm = (Mahiiiii) obb;
mm.details();
	}
}
