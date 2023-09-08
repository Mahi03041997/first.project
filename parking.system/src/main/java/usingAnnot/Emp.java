package usingAnnot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Emp {
int id;
String name;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]";
}
@PostConstruct
public void init() {
	System.out.println("using @ PostConstruct for init method");
}
@PreDestroy
public void destroy() {
	System.out.println("using @ predestroy for destroy");
}
}
