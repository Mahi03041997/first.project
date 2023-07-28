package cb.prgs.prcts;

import java.util.Scanner;

public class EvenOrOdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println("The given number is Even : "+a);
		}
		else {
			System.out.println("The given number is odd : "+a);
		}
	} 

}
