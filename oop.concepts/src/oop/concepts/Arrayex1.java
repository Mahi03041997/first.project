package oop.concepts;

import java.util.Scanner;

public class Arrayex1 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int rowsize = sc.nextInt();
	int columnsize = sc.nextInt();
	int arr[][]= new int [rowsize][columnsize];
	for(int i = 0;i<rowsize;i++) {
		for(int j = 0; j<columnsize;j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	for(int i = 0;i<rowsize;i++) {
		for(int j = 0; j<columnsize;j++) {
		System.out.print(arr[i][j]+" ");
		}
		System.out.println(" ");
	}

}
}

