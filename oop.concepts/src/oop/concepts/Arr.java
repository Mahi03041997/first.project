package oop.concepts;

import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the array");
int size = sc.nextInt();
int start = 0;
int arr []= new int[size];
int end = arr.length-1;
for(int i =0;i<size;i++) {
	System.out.print("enter the values :");
	arr[i] = sc.nextInt();
}
while(start<end) {
	int temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	start ++;
	end --;
}
System.err.println("reverse value of the given array is");
for(int i = 0;i<size;i++) {
	System.out.print(arr[i]+",");
}
	}

}
