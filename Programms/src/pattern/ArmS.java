package pattern;

public class ArmS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 153,temp,original,arm =0;
original = a;
while(a>0) {
	temp = a%10;
	arm = (temp*temp*temp)+arm;
	a = a/10;
}
if (original ==arm) {
	System.out.println(" arm strong");
}
else {
	System.out.println(" not a arm strong");
}
	}
}
