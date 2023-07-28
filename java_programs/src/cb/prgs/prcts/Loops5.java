package cb.prgs.prcts;

import java.util.Scanner;

public class Loops5 {
//	Two numbers are entered through the keyboard. 
//	Write a program to find the value of one number 
//	raised to the power of another. (Do not use Java built-in method)


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the a value");
	int a = sc.nextInt();
	System.out.println("enter the b value");
	int b = sc.nextInt();
	int sum = 1;
	for(int i = 1;i<=b;i++) {
		sum*= a;
	}
	System.out.println(sum);
}
}
