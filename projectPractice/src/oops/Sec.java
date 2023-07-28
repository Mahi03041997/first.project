package oops;

public class Sec extends exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sec s = new Sec();
s.Add();s.Sub();
	}

	@Override
	void Add() {
		// TODO Auto-generated method stub
		a=25;
		b=32;
		c=a+b;
		System.out.println(c);
	}

	@Override
	void Sub() {
		
		a=25;
		b=32;
		c=a-b;
		System.out.println(c);
	}

}
