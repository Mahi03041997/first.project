package javapractice;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mandher";
		str.concat("Singh");
		System.out.println(str);
// while we concat string a new object is created instead of concat the string with old string .
		// for the the program it gives only Mandher as output.
		
	}

}
