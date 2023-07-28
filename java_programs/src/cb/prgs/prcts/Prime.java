package cb.prgs.prcts;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int num = n;
//boolean value = true;
for (int i =2; i<n;i++) {
	if(n%i==0) {
//		 value = false;
		 break;
		 
	}
	System.out.println("it is a prime number");	
	return;
	}
System.out.println("it is not a  prime number");
}

	}


