
class Car05 {
	// 필드 앞에 private 를 사용하면 '은닉화' 의 개념이 적용된다.
	// 현 클라스 외 다른 클라스에선 사용할 수 없다.
	private int speed = 0;
	private int Maxspeed = 300;
	private int Minspeed = 0;
	
	void upSpeed(int value) {
		System.out.println("악셀을 밟습니다");
		if (speed + value > Maxspeed) {
			speed = Maxspeed;
			System.out.println("최고속도 입니다. 현재 속도는 "+getSpeed()+"km/h");
		} else {
			speed = speed + value;
			System.out.println("현재 속도는 "+getSpeed()+"km/h");
		}
	}		
	
	void downSpeed(int value) {
		System.out.println("브레이크를 밟습니다.");
		if (speed - value < Minspeed) {
			speed = Minspeed;
			System.out.println("현재 속도는 "+getSpeed()+"km/h");
		} else {
			speed = speed - value;
			System.out.println("현재 속도는 "+getSpeed()+"km/h");
		}
	}

	int getSpeed() {
		return speed;
	}

//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
}

public class EX01_05 {
	public static void main(String[] args) {
		Car05 myCar1 = new Car05();			
		
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		myCar1.upSpeed(1000);
		
		myCar1.downSpeed(200);
		myCar1.downSpeed(200);
		
	}
}
