package javapractice;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int n = 30;
System.out.println("even number between 1 to "+ n +" is : ");
for(int i = 0;i<n;i++) {
	if(i%2==0) {
		System.out.print(i+ " ");
	}
	
}
System.out.println("\nodd number between 1 to "+ n +" is : ");
for(int i = 0;i<n;i++) {
	if(i%2!=0) {
		System.out.print(i+ " ");
	}
	
}
	}

}
