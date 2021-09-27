
// abstract(추상적인) : 추상 클래스로 만들어주는 명령어
// 추상클래스로 정의 된 클래스는 인스턴스 생성이 불가능하다.
abstract class Car08 {
	int speed;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan08 extends Car08 {
	
}

class Truck08 extends Car08 {
	
}

public class EX08 {
	public static void main(String[] args) {
		Car08 car = new Car08();
		System.out.println("자동차 생성!");
		
		Sedan08 sedan = new Sedan08();
		System.out.println("승용차 생성!");
		Truck08 truck = new Truck08();
		System.out.println("트럭 생성!");
		
	}
}
