package oop.concepts;

import java.util.Scanner;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.err.println("enter the number of persons names you want : ");
		int size = sc.nextInt();
		String []names = new String[size];
		for(int i =0;i<size;i++) {
			System.out.println("enter the "+(i+1)+" person name");
			names[i]=sc.next();
		}
		for(int i =0;i<size;i++) {
			System.out.println("the name of"+(i+1)+"person is : "+names[i]);
		}
	}

}
