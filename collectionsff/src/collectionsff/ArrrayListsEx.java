package collectionsff;

import java.util.ArrayList;

public class ArrrayListsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>al = new ArrayList<>();
al.add("Rakesh");
al.add("Mahesh");
al.add("Praveen");
al.iterator();
for(String name: al) {
	System.out.println(name);
}
String element = al.get(1);
System.out.println(element);

al.add(3, "nikki");
System.out.println(al);
al.set(1, "mahi");
System.out.println(al);
	}

}
