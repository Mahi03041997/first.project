package pattern;

public class Parameter {
	String name;
	int age;
	String gender;
	public Parameter(String name,int age,String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}	
	public String customer(String name) {
		name = "raju";
		return name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Parameter pp = new Parameter("mahi", 26, "M");
System.out.println(pp.toString());
	}

}
