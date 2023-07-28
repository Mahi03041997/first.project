package pattern;

public class Child extends Parent {

	public Child(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p = new Parent(25, 22);
System.out.println(p.add());
	}

}
