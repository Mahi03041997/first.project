package cb.prgs.prcts;

import java.util.Scanner;

public class Greater {

	public void Number() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a value : ");
		int a = scan.nextInt();
		System.out.println("Enter the b value : ");
		int b = scan.nextInt();
		if (a==b) {
			System.out.println("a is equal to b");
		}
		else if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("a is smaller than b");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greater mahi = new Greater();
		mahi.Number();
	}

}
