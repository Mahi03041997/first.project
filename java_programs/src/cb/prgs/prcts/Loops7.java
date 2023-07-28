package cb.prgs.prcts;

import java.util.Scanner;

//Write a program that reads a set of integers, 
//and then prints the sum of the even and odd integers.


public class Loops7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value : ");
	int size = sc.nextInt();
	int num []= new int [size];
	int even = 0;
	int odd=0;
	int i =1;
	for(;i < size;i++ ) {
		num[i]=sc.nextInt();
	}
	for(;i<size;i++) {
		System.out.println(num[i]);
		
		if(i%2==0) {
			System.out.println(" is a even number  " );
			even = even+i;
		}
	}
		for(;i<size;i++){
		if (i%2!=0){
			System.out.println(" is a odd number  " );

				odd = odd+i;
		}
		
		
	}
	
	System.out.println("addition of even value is : " + even);
	System.out.println("addition of odd value is : " +odd);
}
}
