package cb.prgs.prcts;

import java.util.Scanner;

public class ApnaCollege2 {
	public void Example(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value : ");
		String weeks = scan.nextLine();
		switch(weeks) {
		case "day1" :System.out.println("Today is Monday");
		break;
		case "day2" :System.out.println("Today is Tuesday");
		break;
		case "day3":System.out.println("Today is Wensday");
		break;
		case "day4":System.out.println("Today is Thursday");
		break;
		case "day5":System.out.println("Today is Friday");
		break;
		case "day6":System.out.println("Today is Saturday");
		break;
		case "day7":System.out.println("Today is Sunday");
		break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApnaCollege2 rul = new ApnaCollege2();
rul.Example();
	}

}
