package oneman;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "mahi is a good boy";
String n[] = s.split(" ");
for(int i = n.length-1;i>=0;i--) {
	System.out.print(n[i]);
	System.out.print(" ");
}
	}

}
