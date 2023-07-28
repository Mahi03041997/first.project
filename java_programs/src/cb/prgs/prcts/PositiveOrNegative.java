package cb.prgs.prcts;

import java.util.Scanner;

public class PositiveOrNegative {
	public void ssa() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value :");
		int a = sc.nextInt();

		if (a < 0) {
			System.out.println("The Give Value is Negative :" + a);
		} else if (a > 0) {
			System.out.println("The Given Value Is Positive : " + a);
		} else {
			System.out.println("The Given Value Is Netural :" + a);
		}
	}
	public static void main(String[] args) {
		PositiveOrNegative mm = new PositiveOrNegative();
		mm.ssa();
	}

}
