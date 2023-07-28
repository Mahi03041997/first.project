package cb.prgs.prcts;

import java.util.Scanner;

public class LoopsClass {


	// TODO Auto-generated method stub
	public static void main(String[] args) {
		//		
		//	        
		//	        for(int i = 0;i<=10;i++) {
		//	        	
		//	        	System.ou2t.println(i);
		//	        }

		//	    int a = 0;
		//	    while (a<=10) {
		//	    	System.out.println(a);
		//	    	a=++a;
		//	    }
		//			int a=0;
		//			do {
		//				System.out.println(a);
		//				a=++a;
		//			}while(a<=10);

		//			another problem for addition
					Scanner scan = new Scanner(System.in);
					System.out.println("enter the n value");
//					int n =scan.nextInt();
		//			int sum = 0;
		//			for (int i=1;i<=n;i++) {
		//				sum = sum+i;
		//				
		//			}
		//			System.out.println(sum);

		//			another problem for tables
		//			for(int a = 1;a<=10;++a) {
		//				
		//				System.out.println(a*n);
		//			}
					
//					another problem
//					int i =0;
//		for(;i<=n;i++) {
//			if(i%2==0){
////				System.out.println(i);
//			}
//			System.out.println(i);
//		}
//		System.out.println(i);
					
//					int n = scan.nextInt();
//					int m = scan.nextInt();
//					for(int i = 0;i <= n;i++) {
//						for(int j=0; j<=m;j++ ) {
//							System.out.print(" * ");
//						}
//						System.out.println("");
//					}
					
					int n = scan.nextInt();
					int m = scan.nextInt();
					for(int i = 1;i<=n;i++) {
						for(int j=1;j<=m;j++) {
							System.out.print("*");
						}
						System.out.println("");
					}
	}

}
