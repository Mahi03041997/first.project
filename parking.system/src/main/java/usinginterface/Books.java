package usinginterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Books implements InitializingBean, DisposableBean{
int id;
String bookName;

public Books() {
	super();
	// TODO Auto-generated constructor stub
}
public Books(int id, String bookName) {
	super();
	this.id = id;
	this.bookName = bookName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
@Override
public String toString() {
	return "Books [id=" + id + ", bookName=" + bookName + "]";
}



public void afterPropertiesSet() throws Exception {
	System.out.println("it shows init method");	
}
public void destroy() throws Exception {
	System.out.println("it destroys");
	
}

}
