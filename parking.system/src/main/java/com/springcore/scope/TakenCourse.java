package com.springcore.scope;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TakenCourse {
	@Value("#{course}")
private Map<String, Integer> courseDuration;

public TakenCourse() {
	super();
	// TODO Auto-generated constructor stub
}

public Map<String, Integer> getCourseDuration() {
	return courseDuration;
}

public void setCourseDuration(Map<String, Integer> courseDuration) {
	this.courseDuration = courseDuration;
}

@Override
public String toString() {
	return "TakenCourse [courseDuration=" + courseDuration + "]";
}

}
