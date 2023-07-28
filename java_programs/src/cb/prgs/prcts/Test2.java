package cb.prgs.prcts;

import java.util.Scanner;

public class Test2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("what is your name");
		String name=sc.nextLine();
		System.out.printf("hey %s,how are you?\n", name);
		String status = sc.nextLine();
		System.out.printf("what is your age :\n");
		int age = sc.nextInt();
		System.out.println("Thank you for your information");
		sc.close();
	}
}

