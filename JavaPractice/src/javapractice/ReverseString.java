package javapractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "Programming";
String reverse = "";
char ch;
for(int i = 0;i<a.length();i++) {
	ch = a.charAt(i);
	reverse = ch+reverse;
}
System.out.println(reverse);
	}

}
