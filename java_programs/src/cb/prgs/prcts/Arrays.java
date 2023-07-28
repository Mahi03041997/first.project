package cb.prgs.prcts;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the value");
		int size = sc.nextInt();
		int num []= new int [size];
		for(int i = 0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		for(int j = 0;j<size;j++) {
		System.out.println(num[j]);
		}
	}

}
