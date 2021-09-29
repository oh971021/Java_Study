package com.js.accessmf;

public class Human {
	// 어디서든
	public String name;
	// 같은 패키지여야하지만 상속관계면
	// 다른 패키지도 가능하다
	protected String age;
	// 같은 패키지
	String addr;
	// 같은 클래스
	private String birth;
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(birth);
	}
}
