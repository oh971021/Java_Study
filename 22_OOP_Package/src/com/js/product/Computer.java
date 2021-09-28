package com.js.product;

public class Computer extends Product {
	// 접근제한자에 따른 접근제한 보기

	public String cpu;	// 퍼블릭
	int ram;			// 디폴트
	protected int hdd;	// 프로텍티드

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer (String name, int price) {
		super(name, price);
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
	}
}
