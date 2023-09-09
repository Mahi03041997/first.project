package com.springcore.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Education {
	@Value("#{educationqulification}")
private List<String> educationQulification;

public Education() {
	super();
	// TODO Auto-generated constructor stub
}

public List<String> getEducationQulification() {
	return educationQulification;
}

public void setEducationQulification(List<String> educationQulification) {
	this.educationQulification = educationQulification;
}

@Override
public String toString() {
	return "Education [educationQulification=" + educationQulification + "]";
}

}
