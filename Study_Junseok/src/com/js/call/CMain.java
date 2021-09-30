package com.js.call;

public class CMain {
	public static void main(String[] args) {
		Child child = new Child();
	}
}

class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("P-call()");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("P-call(nation)");
	}
}

class Child extends Parent {
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("C-call()");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("C-call(name)");
	}
}