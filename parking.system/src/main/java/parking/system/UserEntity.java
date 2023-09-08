package parking.system;


public class UserEntity {
int id;
String userName;
String password;
String email;
public UserEntity(int id, String userName, String password, String email) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "UserEntity [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
}

public void init() {
	System.out.println("it is init method");
}
public void destroy() {
	System.out.println("it is destroy method");
}

}
