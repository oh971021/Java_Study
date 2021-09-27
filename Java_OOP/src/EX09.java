abstract class Car09 {	// 추상클래스
	int speed;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
	
	// 추상메소드는 Body("{}") 를 가질 수 없다.
	// 추상메소드는 추상클래스 내에서만 존재할 수 있다.
	abstract void work();
	
}

class Sedan09 extends Car09 {
	
	// 추상 메소드는 구현 클래스에서 반드시 재정의해서 사용해야 한다.
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("승용차가 사람을 태움");
	}
}

class Truck09 extends Car09 {
	
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("트럭이 짐을 싣고 있음");
	}
}

public class EX09 {
	public static void main(String[] args) {
//		Car09 car = new Car09();	// 추상클래스로 인스턴스 생성 X
//		System.out.println("자동차 생성!");
//		
		Sedan09 sedan = new Sedan09();
		System.out.println("승용차 생성!");
		sedan.work();
		Truck09 truck = new Truck09();
		System.out.println("트럭 생성!");
		truck.work();
		
	}
}
