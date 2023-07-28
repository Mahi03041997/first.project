package projectPractice;

class inheritance1 extends inheritance {
String password;
inheritance1(String username,String password){
	super(username);
	if(username=="Mahi_1997") {
		System.out.println("enter the password :");
		if(password=="Mahi@1997") {
			System.out.println("invalid");
		}
		else
			System.out.println("Login Successful");
		return;
	}
	else
		System.out.println("login Scuccessful");
	return;
}
}
