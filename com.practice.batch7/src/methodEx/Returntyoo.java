package methodEx;

import java.util.*;
import java.util.List;

public class Returntyoo {
public static ArrayList Names() {
	ArrayList <String >ret = new ArrayList< >();
	ret.add("volvo");
	ret.add("Benz");
	ret.add("Odi");
	ret.add("TATA Indica");
	return ret;
}
public static List Mades() {
	List <String> list = new LinkedList<>();
	list.add("1st car");
	list.add("secound");
	list.add("third");
	return list;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList rr = Returntyoo.Names();
List ll = Returntyoo.Mades();
System.out.println(rr);
System.out.println(ll);
	}

}
