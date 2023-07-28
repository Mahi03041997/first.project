package cb.prgs.prcts;

import java.util.Scanner;

public class EvenOrOdd{

	public static void Number(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int a = sc.nextInt();    
		if(a%2==0) {
			System.out.println("the number is even number : "+a);
		}
		else {
			System.out.println(" the number is odd : "+a);
		}

	}
	public static void main(String[] args) {
		Number();
	}
}
