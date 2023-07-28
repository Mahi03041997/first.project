package methodEx;

public class Student {
String name;
int id;
float marks;
char section;
public void Details() {
	System.out.println("name of the Student : "+name);
	System.out.println("id of the student : "+id);
	System.out.println("total marks of the student : "+marks);
	System.out.println("section of the student : "+section);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student sudheer = new Student();
Student mahi = new Student();
sudheer.name ="SUDHEER";
sudheer.id = 32;
sudheer.marks= 78.30F;
sudheer.section = 'A';
sudheer.Details();
	}

}
