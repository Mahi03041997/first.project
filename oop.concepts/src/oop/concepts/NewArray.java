package oop.concepts;
import java.util.Scanner;
public class NewArray {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the row");
int row = sc.nextInt();
System.out.println("enter the size of the column");
int col = sc.nextInt();
int arr1[][] = new int[row][col];
int arr2[][]= new int [row][col];
int add [][] = new int [row][col];
if (row==col) {
System.err.println("enter the 1st matrix elements");
for(int i = 0;i<row;i++) {
	for(int j=0;j<col;j++) {
		System.out.print("enter the"+" ("+i+","+j+") "+"index value :");
		arr1[i][j] = sc.nextInt();
	}
}
System.err.println("enter the 2nd matrix elements");
for(int i = 0;i<row;i++) {
	for(int j=0;j<col;j++) {
		System.out.print("enter the"+" ("+i+","+j+") "+"index value :");
		arr2[i][j] = sc.nextInt();
	}
}
System.out.println("first matrix is :");
for(int i =0;i<row;i++) {
	for(int j =0;j<col;j++) {
		System.out.print(arr1[i][j]+" ");
	}
	System.out.println();
}
System.out.println("secound matrix is :");
for(int i =0;i<row;i++) {
	for(int j =0;j<col;j++) {
		System.out.print(arr2[i][j]+" ");
	}
	System.out.println();
}
System.out.println("the addtion of the two matrix is ");
for(int i =0;i<row;i++) {
	for(int j =0;j<col;j++) {
		add[i][j]=arr1[i][j]+arr2[i][j];
		System.out.print(add[i][j]+" ");
	}
	System.out.println();
}}
else {
	System.err.println(" the rows and columns should be same");
}}}
