package methodEx;

public class Pen {
	
	public static void Writing() {
		System.out.println("wrinting");
	}
	public void IntFiing() {
		System.out.println("ink");
	}

	public static void main(String[] args) {
		
		Writing();
		Pen p = new Pen();
		p.IntFiing();
	}

}
