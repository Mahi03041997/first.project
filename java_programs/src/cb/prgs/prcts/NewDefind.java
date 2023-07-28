package cb.prgs.prcts;

import java.util.Scanner;

public class NewDefind {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("what is your name ?");
	String name = sc.nextLine();
	System.out.printf("hey %s, how are you? \n", name);
	String status = sc.nextLine();
	System.out.println("where are you from ?");
	String place = sc.nextLine();
//	place = sc.nextLine();
	System.out.println("what is your education qulification ?");
	String qulification = sc.nextLine();
	System.out.println("what is your age ?");
	int age = sc.nextInt();
	
	//qulification = sc.nextLine();
	sc.close();
}
}
