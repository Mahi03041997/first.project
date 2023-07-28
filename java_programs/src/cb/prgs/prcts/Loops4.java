package cb.prgs.prcts;

import java.util.Scanner;

public class Loops4 {
	//	Write a program to find the factorial value of any number 
	//	entered through the keyboard.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value : ");
		int num = sc.nextInt();
		int sum = 1;
		for(int i = 1;i<=num;i++) {
			sum = sum*i;
		}
		System.out.println(sum);
	}

}
