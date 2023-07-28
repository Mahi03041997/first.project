package methodEx;
import java.io.*;
public class Studenttt implements Serializable {
	private static final long serialVersionUID = 1L;
transient String name;
private int id;
private float marks;
private String fname;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public Studenttt(String name, int id, float marks, String fname) {
	super();
	this.name = name;
	this.id = id;
	this.marks = marks;
	this.fname = fname;
}
@Override
public String toString() {
	return "Studenttt [name=" + name + ", id=" + id + ", marks=" + marks + ", fname=" + fname + "]";
}
	

}
