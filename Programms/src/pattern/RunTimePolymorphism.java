package pattern;

public class RunTimePolymorphism {
	public void customer(String name,int id) {
		System.out.println("this is example of overloading ");
	}
	
	public void customer(String name,int id, int fee) {
		System.out.println("this is example of overloading with extra fee");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RunTimePolymorphism rr = new RunTimePolymorphism();
rr.customer("mahi", 22);
rr.customer("mahi", 22, 32000);
	}

}
