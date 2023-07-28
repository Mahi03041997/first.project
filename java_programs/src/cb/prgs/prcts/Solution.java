package cb.prgs.prcts;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value ");
		int a = sc.nextInt();
		
		if (a>=1&&a<=100){
			if (a%2==0){
				if ((a>2&&a<5)||(a>20&&a<100)){
					System.out.println("Not Wired");
				}
				else {
					System.out.println("Wired");
				}
			}
				else 
					System.out.println("Wired");
			}
			
		else
			System.out.println("Out of Range");
		}
	}