package projectPractice;

import java.util.Scanner;

public class Correct_Details  {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("login id : ");
		String id = sc.nextLine();
		System.out.println("Password : ");
		String pass = sc.nextLine();
		/*
		 * Login log = new Login(); log.Check();
		 */
		int i = 0;
		for(;i<2;i++) {
		if(!id.equals("Mahi_1997")||!pass.equals("Mahi@1997")) {
			System.err.println("invalid login id or password");
			System.out.println("Renter the password");
			System.out.println("enter the login id");
			id = sc.next();
			System.out.println("enter the password");
			pass = sc.next();
		}
		
		else {
			System.out.println("login Succesfull");
			break;
		}
		}
		if (i>2) 
			System.out.println("entered password more than three times");
		
		System.exit(0);
	}
}
