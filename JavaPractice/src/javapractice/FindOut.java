package javapractice;

import java.util.Arrays;

public class FindOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a = {1,2,1,3,2,1,2,3,2,3,4,5,6,2};
int left = 0;
int right = a.length-1;
while(left<right) {
	if(a[left]==2) {
		left++;
		
	}else if(a[right]==2) {
		int temp = a[right];
		a[right]= a[left];
		a[left]= temp;
		left ++;
		right --;
	} else {
		right --;
	}
}
System.out.println(Arrays.toString(a));
	}

}
