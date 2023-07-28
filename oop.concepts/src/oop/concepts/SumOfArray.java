package oop.concepts;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of an array");
int sum =0;
int row = sc.nextInt();
int col = sc.nextInt();
int arr[][]= new int [row][col];
for(int i =0;i<row;i++) {
	for(int j =0;j<col;j++) {
		System.out.print("enter the "+(i+1)+" element :"  );
	arr[i][j]=sc.nextInt();
}
	}
for(int i =0;i<row;i++) {
	for(int j = 0;j<col;j++) {
	System.out.print(arr[i][j]+ " ");
	sum+= arr[i][j];
	}
	System.out.println();

}
System.out.println(sum);
	}

}
