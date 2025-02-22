package com.hiberMap.DemoMap;

import java.util.ArrayList;
import java.util.List;


@javax.persistence.Entity
public class Laptop {
	@javax.persistence.Id
	private int lid;
	private String lname;
	@javax.persistence.ManyToMany
	private List<Student> student = new ArrayList<Student>();
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", student=" + student + "]";
	}
	
	
}
