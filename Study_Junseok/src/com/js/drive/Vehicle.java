package com.js.drive;

public class Vehicle {
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Bus extends Vehicle {
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}
}

class Taxi extends Vehicle {
	@Override
	public void run() {
		System.out.println("�ýð� �޸��ϴ�.");
	}
}

class Circle extends Vehicle {
	@Override
	public void run() {
		System.out.println("�����Ű� �޸��ϴ�.");
	}
}
