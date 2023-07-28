package javapractice;

public class SumOfTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1223;
		int sum = 0;
		int x;
		while(a>0) {
			x = a%10;
			sum += x;
			a = a/10;
		}
		System.out.println(sum);

	}

}
