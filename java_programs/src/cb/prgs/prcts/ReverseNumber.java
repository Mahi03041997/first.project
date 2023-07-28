package cb.prgs.prcts;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 911077105;
		int reverse = 0;
		for(;num!=0;num = num/10) {
			int reminder=num%10;
			reverse = reverse*10+reminder;
		}
		System.out.println("the reverse of the given number "+reverse);
	}

}
