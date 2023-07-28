package collectionsff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class New_Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> m = new ArrayList<>();
		m.add(4);
		m.add(6);
		m.add(10);
		System.out.println(m);
		m.iterator();
		for(Integer n :m) {
			System.out.println(n);
			
		}
		m.add(0, 22);
		System.out.println(m);
		
		m.remove(1);
		System.out.println(m);
		
		
		int d = m.get(2);
		System.out.println(d);
		
		Collections.sort(m);
		System.out.println(m);
for(Integer a :m) {
	System.out.println(a);
}
	}

}
