package examples.of.java;

public class Patter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		int columns = 5;
		for(int i = 0; i<=rows;i++) {
			for(int j = 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
