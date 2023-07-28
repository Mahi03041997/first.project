package oop.concepts;
import java.util.Scanner;
public class spiralarray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows of an array : ");
		int size=sc.nextInt();
		int arr[][]=new int[size][size];
		System.out.println("Enter the elements of an array : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			}
		}
		/*  Sample output :1	2	3	10	11	12	16	15	14	13	7	4	5	6	9	8	
		 *1  2  3  10	   00   01  02  03  13  23  33  32  31  30  20  10  11  12  22  21	
		 *4  5  6  11		observation : 
		 *7  8  9  12		odd=columns=>1st iteration straight ,2nd iteration reverse
		 *13 14 15 16		even =rows =>1st iteration straight ,2nd iteration reverse 
		 */
	}
}
