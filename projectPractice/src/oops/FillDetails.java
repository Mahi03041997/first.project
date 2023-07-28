package oops;

import java.util.Set;

public class FillDetails extends Student {
void Details() {
	FillDetails ff = new FillDetails();
	ff.setName("Mahi");
	ff.setId(254);
	ff.setSection('A');
	System.out.println(ff.getName());
	System.out.println(ff.getSection());
	System.out.println(ff.getId());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FillDetails m = new FillDetails();
			
		m.Details();
	}
	}

