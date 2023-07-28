package cb.prgs.prcts;

public class NewReverse {
public static void main(String[] args) {
	int a = 22775;
	int result = 0;
	for (;a!= 0;a = a/10);{
	int reminder = a%10;
	result = result*10+reminder;
	}
	System.out.println("reverse " + result);
}

}
