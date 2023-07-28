package examples.of.java;

public class rever {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a ="464";
char ch;
int i;
String reverse = "";
for(i=0;i<a.length();i++) {
ch = a.charAt(i);
reverse = ch+reverse;
}
System.out.println(reverse);
if (a.equalsIgnoreCase(reverse)) {
	System.out.println("palindrom");
}
else {
	System.out.println("not palindrom");
}
	}
}
