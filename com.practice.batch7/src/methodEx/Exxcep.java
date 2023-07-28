package methodEx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Exxcep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
int a = 15;
int b = 0;
int arr[]= {2,3,4,5,6};
int c;
try {
 c = a/b;
}catch (ArithmeticException ae) {
	System.out.println("15 cannot be divided by zero");
}
try {
	arr[3]= 12;
arr[6] = 14;

}catch (ArrayIndexOutOfBoundsException aibe) {
	System.out.println("the size of array is 5 so cannnot defined 6");
}
finally {
	System.out.println(b/a);
}
System.out.println(arr[3]);
//FileOutputStream fff = new FileOutputStream("F:\\test.text");
File ff = new File("F:\\test.text");
FileInputStream file = new FileInputStream(ff);
System.out.println(file);

try {
	Findfile();
}catch(Exception ie) {
	System.out.println("file not find");
}

	}

	private static void Findfile() {
		// TODO Auto-generated method stub
		
	}

}
