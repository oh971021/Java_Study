class Car01 {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -= value;
	}
}

class Sedan01 extends Car01 {
	int seatNum;
}

class Truck01 extends Car01 {
	int capacity;
}

public class EX01 {
	public static void main(String[] args) {
		// 세단, 트럭을 만든다.
		Sedan01 sedan01 = new Sedan01();
		Truck01 truck01 = new Truck01();
		
		sedan01.upSpeed(120);
		truck01.upSpeed(80);
		
		sedan01.seatNum = 5;
		truck01.capacity = 50;
		
		System.out.println("자동차의 좌석 수 : "+sedan01.seatNum);
		System.out.println("자동차의 적재량 : "+truck01.capacity);
		
	}
}
