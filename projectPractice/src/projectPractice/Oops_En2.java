package projectPractice;
import java.util.*;
public class Oops_En2 {
 static float balance = 1500f;
// static float current_balance;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the account number : ");
String ac = sc.nextLine();
if(ac.equals("635202010007401")) {

	System.out.println("The name of the Account Holder is : Solanki Mandher Singh");
	System.out.println("The Account is : 635202010007401");
	System.out.println("The Email of Account Holder is : royalrajputmahibanna@gmail.com");
	System.out.println("The Balance in the Account is : 1500 ");

}
else {
	System.out.println("Invalid Credentials Provided");
	return;
}
System.out.println("Enter what do you want to perform");
System.out.println("press 1 for deposit");
System.out.println("press 2 for withdraw");
int value = sc.nextInt();
switch(value) {
case 1 :
System.out.println("enter the amount for deposit");
float deposit_amount = sc.nextFloat();
if (deposit_amount>0) {
	balance = deposit_amount + balance; 
	System.out.println(balance);
	break;
}
case 2 :
System.out.println("enter ther amount to withdraw");
float withDraw = sc.nextFloat();
if(withDraw > 0) {
	withDraw = balance - withDraw;	
	
	System.out.println(withDraw);
	break;
	
	}

}
System.out.println("Do you want to perform another option ");
System.out.println("yes or no");
String action = sc.nextLine();
action = sc.nextLine();
if (action.equals("yes")) {
	System.out.println("what do you want to perform");
	System.out.println("press 1 for Deposit or press 2 for withdraw");
	int sec = sc.nextInt();
switch (sec) {
case 1:
	System.out.println("enter  the amount for deposit");
	float deposit_amount = sc.nextFloat();
if (deposit_amount>0) {
	balance = deposit_amount + balance; 
	System.out.println(balance);
	break;
}
case 2 :
System.out.println("enter ther amount to withdraw");
float withDraw = sc.nextFloat();
if(withDraw > 0) {
	balance -= withDraw;	
	
	System.out.println(balance);
	break;
}
}
}
if (action.equals("no")) {
	System.out.println("Thank you to banking with us");
}
System.out.println("your final balance is : " + balance);

}
}
