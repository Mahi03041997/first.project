package projectPractice;

public class MethodOverloading {
	public int add(int a,int b) {
		return(a+b);
	}


public int add1(int a,int b,int c) {
	return(a+b+c);
}
public double add2(double a,double b) {
	return (a+b);

}
public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading();
	obj.add(12, 6);
	obj.add1(3, 7, 8);
	obj.add2(5, 7);
}
}
