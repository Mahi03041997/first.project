package oop.concepts;
import java.util.Scanner;
public class Arraysa11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of a row : ");
		int size1=sc.nextInt();
		System.out.print("enter the size of the column : ");
		int size2=sc.nextInt();
		int arr[][]=new int[size1][size2];
		int arr1[][]=new int[size1][size2];
		int add[][]=new int[size1][size2];
		if(size1!=size2) {
			System.err.println("The rows and columns should be same for matrix addition");
			return;
		}
		System.err.println("Enter the elements of a 1st matrix");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print("enter the "+(i)+" "+(j)+" index value : ");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.err.println("Enter the elements of a 2nd matrix");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print("enter the "+(i)+" "+(j)+" index value : ");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 1st matrix");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The 2nd matrix");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.err.println("The matrix addition is");
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				add[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
		
		}
}
