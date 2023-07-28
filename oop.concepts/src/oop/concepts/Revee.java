package oop.concepts;

public class Revee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 567;
int reverse=0;
int temp=1;
while(num!=0) {
	temp = num%10;
	reverse = (reverse*10)+temp;
	num = num/10;
}
System.out.print(reverse);
	}

}
