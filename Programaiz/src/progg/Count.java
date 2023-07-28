package progg;

import java.util.HashMap;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> word = new HashMap<>();
String str = "this book belongs to me";
String [] s = str.split(" ");
for (String words :s ) {
	Integer integer = word.get(s);
}


	}

}
