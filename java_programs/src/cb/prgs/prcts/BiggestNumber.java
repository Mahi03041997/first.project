package cb.prgs.prcts;


public class BiggestNumber {
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 80;
		int d = 40;
		int e = 50;
	if ((a>b)&&(a>c)&&(a>d)&&(a>e)) {
		System.out.println("A is the Biggest Number:" +a);
	}
	else if ((b>c)&&(b>e)&&(b>d)) {
		System.out.println("B is the Biggest Number:" +b);
	}
	else if ((c>d)&&(c>e)) {
		System.out.println("C is the Biggest Number :" +c);
		}
	else if (d>e){
		System.out.println("D is the Biggest Number :"+d);
	}
	else {
		System.out.println("E is the Biggest Number :" +e);
	}
	}
}
