	package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student
{
	private String studentName;
	private List<String>studentPhones;
	private Set<String>studentAddress; 
	private Map<String,String>studentCourses;

	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getStudentPhones() {
		return studentPhones;
	}
	public void setStudentPhones(List<String> studentPhones) {
		this.studentPhones = studentPhones;
	}
	public Set<String> getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Set<String> studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Map<String, String> getStudentCourses() {
		return studentCourses;
	}
	public void setStudentCourses(Map<String, String> studentCourses) {
		this.studentCourses = studentCourses;
	}
	public Student(String studentName, List<String> studentPhones, Set<String> studentAddress,
			Map<String, String> studentCourses) {
		super();
		this.studentName = studentName;
		this.studentPhones = studentPhones;
		this.studentAddress = studentAddress;
		this.studentCourses = studentCourses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentPhones=" + studentPhones + ", studentAddress="
				+ studentAddress + ", studentCourses=" + studentCourses + "]";
	}
	
	
	

}
