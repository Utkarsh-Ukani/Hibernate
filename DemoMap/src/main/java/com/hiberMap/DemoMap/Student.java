package com.hiberMap.DemoMap;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;


@javax.persistence.Entity
public class Student {
	@javax.persistence.Id
	private int rollno;
	private String name;
	private int marks;
	
	@javax.persistence.ManyToMany(mappedBy = "student",fetch = FetchType.EAGER)
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
}
