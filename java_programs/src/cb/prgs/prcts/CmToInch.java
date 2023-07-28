package cb.prgs.prcts;

import java.util.Scanner;

public class CmToInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the cm");
int cm = sc.nextInt();
float f = cm/2.54f;
System.out.println(f);
	}

}
