class Car06 {
	int speed;
	
	public Car06() {
		// TODO Auto-generated constructor stub
	}

	public Car06(int speed) {
		super();
		this.speed = speed;
	}
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("현재속도(슈클) => "+this.speed);	// + 속도제한
	}
}

class Truck06 extends Car06 {
	
	@Override
	void upSpeed(int speed) {
		// TODO Auto-generated method stub
		super.upSpeed(speed);
		if (this.speed > 150) {
			this.speed = 150;
			System.out.printf("제한속도는 %dkm/h 입니다.\n", this.speed);
		}
	}
}

class Sedan06 extends Car06 {
	
	@Override
	void upSpeed(int speed) {
		// TODO Auto-generated method stub
		super.upSpeed(speed);
		if (this.speed > 200) {
			this.speed = 200;
			System.out.printf("제한속도는 %dkm/h 입니다.\n", this.speed);
		}
		super.upSpeed(speed);
	}
}

public class EX06 {
	public static void main(String[] args) {
		
		// 슈퍼클래스 스피드 : 1000
		// 트럭 최고속도 : 150
		// 세단 최고속도 : 200
		
		Truck06 truck = new Truck06();
		Sedan06 sedan = new Sedan06();
		
		truck.upSpeed(150);
		sedan.upSpeed(200);
		
	}
}
