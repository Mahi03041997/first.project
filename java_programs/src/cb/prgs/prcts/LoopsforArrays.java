package cb.prgs.prcts;

import java.util.Scanner;

public class LoopsforArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("enter the  size of the rows : ");
int column = sc.nextInt();
System.out.print("enter the size of the columns : ");
int rows = sc.nextInt();
int arr[][]=new int[rows][column];
for(int i=0;i<rows;i++) {
	for(int j=0;j<column;j++) {
		arr[i][j]=sc.nextInt();
	}
}
for(int i=0;i<rows;i++) {
	for(int j=0;j<column;j++) {
		System.out.print(arr[i][j]+ " ");
	}
	System.out.println("");
}
	}
}
