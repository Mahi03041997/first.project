package oop.concepts;

import java.util.Scanner;

public class RRReee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.err.println("enter the rows");
int row = sc.nextInt();
System.err.println("enter the columns");
int col = sc.nextInt();
int arr[][]= new int [row][col];
System.out.println("enter the matrix");
for(int i =0;i<row;i++) {
	for(int j =0;j<col;j++) {
	arr[i][j] = sc.nextInt();
	}
}
System.out.println("the matrix you entered");
for(int i =0;i<row;i++) {
	for(int j=0;j<col;j++) {
	System.out.print(arr[i][j]);
	}
	System.out.println();
}
System.err.println("reverse of the matrix you entered");
for(int i =(row-1);i>=0;i--) {
	for(int j=(col-1);j>=0;j--) {
	System.out.print(arr[i][j]);
	}
	System.out.println();
}
	}

}
