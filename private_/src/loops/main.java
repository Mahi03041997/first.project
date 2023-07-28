package loops;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		scanner1 s1=new scanner1();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of elements to print : ");
		int num=s.nextInt();
		System.out.print("Before updated : ");
		s1.getNum();
		s1.setNum(num);
		s1.numbers1(num);
		System.out.print("updated value of number : ");
		s1.getNum();
	}

}
 
