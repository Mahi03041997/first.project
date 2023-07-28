package program;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean isPrime = true;
//		int a = 17;
for (int i=2;i<a;i++) {
	if(a%i==0) {
		isPrime = false;
	}
	
}
if(isPrime) {
	System.out.println("is prime number");
}
else {
	System.out.println("not prime");
}

	}

}
