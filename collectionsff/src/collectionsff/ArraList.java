package collectionsff;

import java.util.ArrayList;

public class ArraList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> arr = new ArrayList<>();
arr.add("volvo");
arr.add("benz");
arr.add("indigo");
String a = arr.get(1);
System.out.println(a);
for(String itr: arr) {
	System.out.println(itr);
}
	}

}
