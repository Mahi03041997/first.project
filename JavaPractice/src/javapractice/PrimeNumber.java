package javapractice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		boolean prime = true;
		for(int i =2; i<a/2;i++) {
			if(a%i==0) {
				prime = false;
				break;
			}
			}
		if(prime) {
			System.out.println("the given number is prime");
		}else {
			System.out.println("the given number is not a prime");
		}
		}
}
