package javapractice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1234;
		int b =1;
		int x;
		while(a>0) {
			x = a%10;
			b *= x ;
			a = a/10;
			
		}
System.out.println(b);
	}

}
