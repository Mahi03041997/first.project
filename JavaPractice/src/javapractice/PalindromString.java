package javapractice;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated 
		String str = "madam";
		int left = 0;
		int right = str.length()-1;
		// System.out.println(right);
		boolean palindrom = true;
		while(left<=right) {
			if(str.charAt(left)!=str.charAt(right)) {
				palindrom = false;
			}
			left++;
			right--;
		}
		if(palindrom) {
			System.out.println("palindrom");
		}else {
			System.out.println("not a palindrom");
		}
	}
}
