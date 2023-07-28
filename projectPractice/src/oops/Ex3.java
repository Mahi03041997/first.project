package oops;

public class Ex3 implements Ex1, Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ex3 e = new Ex3();
e.One();
e.Two();
e.Three();
e.Four();
	}

	@Override
	public void Three() {
		System.out.println(3);
		
	}

	
	public void Four() {
		// TODO Auto-generated method stub
		System.out.println(4);
	}

	
	public void One() {
		// TODO Auto-generated method stub
		System.out.println(1);
	}

	
	public void Two() {
		// TODO Auto-generated method stub
		System.out.println(2);
	}

}
