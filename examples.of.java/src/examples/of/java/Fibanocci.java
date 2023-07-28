package examples.of.java;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 31;
int i;
boolean b = true;
for(i =2;i<a;i++) {
	if(a%i==0) {
		b = false ;
	}
}
	if(b) {
		System.out.println(a+ " is a prime");
	}
	else {
		System.out.println(a+ " is not a prime");
	}

	}

}
