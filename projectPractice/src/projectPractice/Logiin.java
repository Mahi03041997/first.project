package projectPractice;
import java.util.Scanner;
public final class Logiin {

	public static void main(String[] args) {
		String name;
		String pass;
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		pass=in.nextLine();
		inheritance1 secure=new inheritance1(name,pass);
	}

}
