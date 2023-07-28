package cb.prgs.prcts;

import java.util.Scanner;

public class Test3 {
	public static void ScannerLatest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name ?");
		String name = sc.nextLine();
		System.out.printf("hey %s, how are you? \n", name);
		String status = sc.nextLine();
		System.out.println("what is your age ?");
		int age = sc.nextInt();
		System.out.println("where are you from ?");
		String place = sc.nextLine();
	//	place = sc.nextLine();
		System.out.println("what is your education qulification ?");
		String qulification = sc.nextLine();
		//qulification = sc.nextLine();
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerLatest();
	}

}
