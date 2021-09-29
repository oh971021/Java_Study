package com.js.gas;

public class Car {
	private int gas;

	public Car(int gas) {
		super();
		this.gas = gas;
	}
	
	public Car() {}
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("������ �����ϴ�.");
			return false;
		} else {
			System.out.println("������ �ֽ��ϴ�.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("�޸��ϴ�. (���� ������ : "+gas+" )");
				gas -= 1;
			} else {
				System.out.println("����ϴ�. (���� ������ : "+gas+" )");
				return;
			}
		}
	}
}
