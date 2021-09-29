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
			System.out.println("가스가 없습니다.");
			return false;
		} else {
			System.out.println("가스가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다. (남은 가스량 : "+gas+" )");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (남은 가스량 : "+gas+" )");
				return;
			}
		}
	}
}
