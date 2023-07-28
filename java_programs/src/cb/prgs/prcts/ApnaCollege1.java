package cb.prgs.prcts;

import java.util.Scanner;

public class ApnaCollege1 {
	Scanner scan = new Scanner(System.in);
	public void Example() {
		System.out.println("enter a value : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = a*b;
		if (a+b==c) {
			System.out.println(c);
		}
		else if (a*b==c) {
			System.out.println(c);
		}
		else if (a-b==c) {
			System.out.println(c);
		}
		else if (a/b==c) {
			System.out.println(c);
		}
		else if (a%b==c) {
			System.out.println(c);
		}
		else {
			System.out.println("your input not matched");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApnaCollege1 ex = new ApnaCollege1();
		ex.Example();
	}

}
