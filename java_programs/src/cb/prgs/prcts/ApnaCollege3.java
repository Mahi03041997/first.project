package cb.prgs.prcts;

import java.util.Scanner;

public  class ApnaCollege3 {
	public  void Example() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the letter to know is it vowel or not");
		char letter = scan.next().charAt(0);
		switch(letter) {
		case 'a' :System.out.println("This is Vowel");
		break;
		case 'e' :System.out.println("This is Vowel");
		break;
		case 'i' :System.out.println("This is Vowel");
		break;
		case 'o' :System.out.println("This is Vowel");
		break;
		case 'u' :System.out.println("This is Vowel");
		break;
		default:System.out.println("Not a Vowel");
		}
	}
	public static void main(String[] args) {
		ApnaCollege3 rll = new ApnaCollege3();
		rll.Example();
	}
}
