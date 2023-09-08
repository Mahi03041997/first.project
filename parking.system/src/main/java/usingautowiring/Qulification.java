package usingautowiring;

public class Qulification {
String course;

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}

@Override
public String toString() {
	return "Qulification [course=" + course + "]";
}

}
