package cb.prgs.prcts;

import java.util.Scanner;

public class Loops3 {
//	Write a program that prompts the user to input a positive integer.
//	It should then print the multiplication table of that number.
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	for(int i = 1;i<11;i++) {
		System.out.println(num+" X "+i+" = "+num*i);
	}
	
}
}
