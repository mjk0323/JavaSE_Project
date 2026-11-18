package mylab.student.entity;

import mylab.student.exception.InvalidGradeException;

public class Student extends Object {
	private int studentId;
	private String name;
	private String major;
	private int grade;
	
	public Student() {
		
	}
	
	public Student(int studentId, String name, String major, int grade) {
		this.studentId = studentId;
		this.name = name;
		this.major = major;
		this.grade = grade;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void changeGrade (int newGrade) throws InvalidGradeException {
		if(newGrade>4) {
			throw new InvalidGradeException("학년은 1~4 사이의 값이어야 합니다.", this.grade);
		}
		this.grade = newGrade;
	}
}

