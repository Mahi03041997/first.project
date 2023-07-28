package oop.concepts;

public class Reevs {
	
public static void main(String[] args) {
	String m = "mahi";
	char ch;
	String reverse = "";
	for(int i =0;i<m.length();i++) {
		ch = m.charAt(i);
		reverse = ch+reverse;
	}
	System.out.println(reverse);
}
}
