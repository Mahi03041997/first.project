
package oops_concept;
import projectPractice.Correct_Details;
public class Emp_1   {
	int id;
	String name;
	String Role;
	Practice_Entity practice;
	public Emp_1(int id, String name, String Role,Practice_Entity practice) {
		this.id = id;
		this.name= name;
		this.Role = Role;
		
		this.practice = practice;
	}
	void check() {
		System.out.println(id + " "+ name +" "+ Role );
		System.err.println(practice.h_no + " " + practice.village +" "+practice.town + " "+ practice.state);
	}
	public static void main(String[] args) {

		Practice_Entity p1 = new Practice_Entity(215, "Ayyagaripeta", "Sathupally", "Khammam", "Telangana");
		Practice_Entity p2 = new Practice_Entity(22, "New ", " Suryapeta", "New York", "Telangana");

		Emp_1 e1 = new Emp_1(22, "Mahi", "Dev", p1);
		Emp_1 e2 = new Emp_1(21, "Mahesh", "Test", p2);
		e1.check();
		e2.check();
	}
	Correct_Details dd = new Correct_Details();
	
	//public -access anywhere
}
