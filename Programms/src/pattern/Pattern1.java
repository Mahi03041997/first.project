package pattern;

import java.util.Iterator;

public class Pattern1 {
int rows;
int col;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern1 p = new Pattern1();
//p.Pattern_1();
//System.out.println(" ");
//p.Pattern2();
//System.out.println(" ");
p.Pattern3();
	}
	void Pattern_1() {
		rows = 4;
		col = 4;
		for(int i =1;i<=rows;i++) {
			for(int j =1;j<=col;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		
	}
	void Pattern2() {
		rows = 5;
		for(int i = 1;i<=rows;i++) {
			for(int j =1; j<= i;j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
	void Pattern3() {
		int n=5;
		for (int i = 1; i <= n; i++) {
			for(int j = 1;j<= n; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
