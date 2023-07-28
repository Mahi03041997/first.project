package javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Employee>al = new ArrayList<>();
		Employee emp = new Employee(101, "mahi", 32000.00f);
		Employee emp1 = new Employee(102, "raju", 48000.00f);
		Employee emp2 = new Employee(103, "eswar", 21000.00f);
		
		al.add(emp);
		al.add(emp1);
		al.add(emp2);
		ListIterator<Employee> employee = al.listIterator();
		while(employee.hasNext()) {
			employee.next();
			System.out.println(employee);
		}
	}

}
