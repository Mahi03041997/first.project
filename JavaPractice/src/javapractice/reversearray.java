package javapractice;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5,6,7,8};
		System.out.print("{");
		for(int i = arr.length-1;i>=0;i--) {
			if(i==0) {
				System.out.print(arr[i]);
			}else {
				System.out.print(arr[i]+",");
			}
		}
		System.out.print("}");

	}

}
