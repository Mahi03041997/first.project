package oop.concepts;

import java.util.Scanner;

public class Minee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter how many values you want: ");
int size = sc.nextInt();
int arr[]= new int [size];
int min = arr[0];
int max= arr[0];
System.err.println("enter the values you want");
for(int i=0;i<size;i++) {
	arr[i]= sc.nextInt();
}

for(int i =0;i<size;i++) {
	if(min>arr[i]) 
		min = arr[i];
	if(max<arr[i]) 
		 max = arr[i];
}
System.out.println("The min value is : "+min);
System.out.println("The max value is : "+max);
	}
}
