package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Student class - Student Name method");

	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Student class - Student Department method");

	}
	
	public void studentId() {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Student class - Student Id method");

	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.collegeName();
		student.collegeRank();
		student.collegeCode();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
	}

}
