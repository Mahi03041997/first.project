package com.interview;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "madam";
		int left = 0;
		int right = str.length()-1;
		boolean palindrom = true;
		while(left<=right) {
			if(str.charAt(left)!= str.charAt(right)) {
				palindrom = false;
				
			}
			left ++;
			right --;
		}
		if(palindrom) {
			System.out.println("palindrom");
		} else {
			System.out.println("not a palindrom");
		}

	}

}
