package com.js.product;

public class Computer extends Product {
	// ���������ڿ� ���� �������� ����

	public String cpu;	// �ۺ�
	int ram;			// ����Ʈ
	protected int hdd;	// ������Ƽ��

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
