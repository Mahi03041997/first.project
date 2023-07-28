package cb.prgs.prcts;

import java.util.Scanner;

public class FailOrPass {
	public static void Result() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int a = sc.nextInt();
		if (a>=85) {
			System.out.println("you got First Class : "+a+" marks");
			
		}
			else if(a>=70&&a<85){
				System.out.println("you got secound class : "+a+" marks");
			}
				else	if (a>=35) {
					System.out.println("you got pass marks : "+a+" marks");
				}
				else {
					System.out.println("you got below 35 marks so you failed the exam : "+a+" marks");
				}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result();
	}

}
