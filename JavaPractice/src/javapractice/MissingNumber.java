package javapractice;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {1,2,3,4,5,7};
int sum = 0;
for(int i =0;i<arr.length;i++) {
	sum = sum+arr[i];
}
System.out.println(sum);
int n = arr.length+1;

int num = n*(n+1)/2;
System.out.println(num);
System.out.println("....................");
System.out.println(num-sum);
	}

}
