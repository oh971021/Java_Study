package com.js.extendsex;

class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends B {}
class F extends C {}

public class EX {
	public static void main(String[] args) {

		B b1 = new D();
		System.out.println(b1);
		
//		B b2 = (B)new A();
//		System.out.println(b2);
	
		A a = new B();
		B b = (B)a;
		
	}
}
