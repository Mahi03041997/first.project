package oops;

public class Child extends Father {
	void Age() {
		System.out.println(" My age is : 23");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child c = new Child();
c.FatherAge();
c.Age();
	}

}
