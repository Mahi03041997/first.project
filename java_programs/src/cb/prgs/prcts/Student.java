package cb.prgs.prcts;

public class Student {

String name;
int id;
float marks;

void Data(int i, String n, float m) {
	name = n;
	id = i;
	marks =m;
	}
	void Inform() {
	System.out.println(id + ", "+ marks +", "+ name);
}
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.name = "Suresh";
		s1.id = 25;
		s1.marks= 36.77f;
		s2.name = "Mahi";
		s1.Inform();
	}

}
