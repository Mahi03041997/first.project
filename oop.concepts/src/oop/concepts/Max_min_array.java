package oop.concepts;

public class Max_min_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {5,6,9,10,35,74,11,31,8};
int min =arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++) {
	if(min>arr[i]) 
		min=arr[i];
		if(max<arr[i]) 
			max=arr[i];
}
System.out.println("The max number in array is : "+max);
System.out.println("The min number in array is : "+min);
	}

}
