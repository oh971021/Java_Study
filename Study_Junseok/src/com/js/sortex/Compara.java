package com.js.sortex;

import java.util.ArrayList;
import java.util.Comparator;

import sun.jvm.hotspot.utilities.AddressOps;

public class Compara {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("�ؼ�", 25, "����", 2));
		students.add(new Student("�ָ�", 28, "����", 2));
		students.add(new Student("����", 25, "����", 2));
		students.add(new Student("�ؿ�", 26, "����", 2));
		students.add(new Student("����", 26, "����", 2));
	
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
		
		System.out.println("########## �����մϴ� ##########");
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
		
		System.out.println("########## �����մϴ� ##########");
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
		System.out.printf("%s %d�� %s�� �������̸� %d�г��Դϴ�", getName(), getAge(), school, grade);
	}
}