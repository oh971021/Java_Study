package com.js.sortex;

import java.util.ArrayList;
import java.util.Comparator;

import sun.jvm.hotspot.utilities.AddressOps;

public class Compara {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("준석", 25, "영진", 2));
		students.add(new Student("솔리", 28, "영진", 2));
		students.add(new Student("기훈", 25, "영진", 2));
		students.add(new Student("준원", 26, "영진", 2));
		students.add(new Student("영훈", 26, "영진", 2));
	
		for (int i = 0; i < students.size(); i++) {
			students.get(i).info();
			System.out.println();
		}
		
		Comparator<Student> d = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				return o1Age.compareTo(o2Age);
			}		
		}; 
		
		System.out.println("########## 정렬합니다 ##########");
		students.sort(d);
		
		for (int i = 0; i < students.size(); i++) {
			students.get(i).info();
			System.out.println();
		}
		
		Comparator<Student> d2 = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				String o1Name = o1.getName();
				String o2Name = o2.getName();
				return o1Name.compareTo(o2Name);
			}
		};
		
		System.out.println("########## 정렬합니다 ##########");
		students.sort(d2);
		
		for (int i = 0; i < students.size(); i++) {
			students.get(i).info();
			System.out.println();
		}
		
	}
}

class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) { 
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}	
}

class Student extends Person {
	private String school;
	private int grade;
	
	public Student() {}
	
	public Student(String name, int age, String school, int grade) {
		super(name, age);
		this.school = school;
		this.grade = grade;
	}

	public void info() {
		System.out.printf("%s %d살 %s에 재학중이며 %d학년입니다", getName(), getAge(), school, grade);
	}
}