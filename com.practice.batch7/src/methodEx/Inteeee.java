package methodEx;

public class Inteeee {
static int a = 5;
static int b = 6;
static int c;
public void Add() {
   c = a+b;
   System.out.println(c);
	
}
public static void Sub() {
	c = b-a;
	System.out.println(c);

}
public static void main(String[] args) {
	Inteeee i = new Inteeee();
	i.Add();
	Sub();
}
}
