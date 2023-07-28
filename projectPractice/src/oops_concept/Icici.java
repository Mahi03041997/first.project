package oops_concept;

public class Icici extends Poly_Overriding {

	String Office;
//Poly_Overriding over;
	void LoanDetails() {
			 String name = "ICICI";
			 String duration = " 24 months";
			 float interest = 7.3f;
			 int limit = 6_00_000;
			 System.out.println("Name of the Bank : " + name +"\n Duration of the Loan Period : "+ duration +"\n Interest of the Loan : "+  interest +"\n Loan Limit : "+  limit);
	}
}
