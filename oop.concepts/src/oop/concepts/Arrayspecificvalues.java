package oop.concepts;

import java.util.Scanner;

public class Arrayspecificvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the size of an array");
		int size = sc.nextInt();
int arr[] = new int [size];

boolean value1 = false;
boolean value2 = false;
int a = sc.nextInt();
int b = sc.nextInt();
for(int i = 0;i<size;i++) {
	arr[i] = sc.nextInt();
	if(arr[i] == a) {
		 value1 = true;
	}
	else if (arr[i]==b) {
		value2 = true;
	}
	}
if(value1&& value2) {
	System.out.println(a+" "+b+" are present in an array");
}
else {
	System.out.println(" the entered values does not present");
}
	}

}
