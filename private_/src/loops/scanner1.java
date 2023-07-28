package loops;

public class scanner1 {
	private int n=10;
	public void setNum(int num) {
		n=num;
	}
	public void getNum() {
		System.out.println(n);
		
	}
	private void numbers(int num) {
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		}
	public void numbers1(int num) {
		numbers(num);
	}
	}

