package com.qa.java.oop;

public class CallByReference {

	static String getStudentName(Student student) {
		student.name = "student1updated";
		System.out.println();
		return student.name;
	}

	public static void main(String[] args) {

		Student student = new Student(111, "student1");
		System.out.println(student.name);

		System.out.println(getStudentName(student));
		System.out.println("Student name inside Main : " + student.name);
	}
}
