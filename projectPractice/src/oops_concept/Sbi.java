package oops_concept;

public class Sbi extends Poly_Overriding {
String Office;
void LoanDetails() {
	 String name = "SBI";
	 String duration = " 12 months";
	 float interest =  6.3f;
	 int limit = 10_00_000;
	 System.out.println("Name of the Bank : " + name +"\n Duration of the Loan Period : "+ duration +"\n Interest of the Loan : "+  interest +"\n Loan Limit : "+  limit);
}
}
