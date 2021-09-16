
class Car02 {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

}

public class EX01_02 {
	public static void main(String[] args) {
	
		// 자동차를 만드는 과정
		// 1. 클래스 정의
		// 2. 속성 및 기능 정의
		// 3. Main 에서 객체 생성
		
		Car02 myCar1 = new Car02();	// 실제 자동차(객체)를 생성한 코드
		myCar1.color = "레드";
		myCar1.speed = 0;

		System.out.println(myCar1.color);
		System.out.println(myCar1.getColor());
		System.out.println(myCar1.getSpeed());
	}
}
