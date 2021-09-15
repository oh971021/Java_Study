
class Car {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
	
}


public class EX01_01 {
	public static void main(String[] args) {
	
		// 자동차를 만드는 과정
		// 1. 클래스 정의
		// 2. 속성 및 기능 정의
		// 3. Main 에서 객체 생성
		
		Car myCar1 = new Car();	// 실제 자동차(객체)를 생성한 코드
		myCar1.color = "레드";
		myCar1.speed = 0;
		
		Car myCar2 = new Car();
		myCar2.color = "아마존그레이";
		myCar2.speed = 0;

		Car myCar3 = new Car();
		myCar3.color = "퍼플";
		myCar3.speed = 0;
		
		myCar1.upSpeed(120);
		System.out.println("자동차 1의 색상은 "+ myCar1.color);
		System.out.println("자동차 1의 속도는 "+ myCar1.speed +"km/h");
		
		myCar2.upSpeed(150);
		System.out.println("자동차 2의 색상은 "+ myCar2.color);
		System.out.println("자동차 2의 속도는 "+ myCar2.speed +"km/h");

		myCar3.upSpeed(80);
		System.out.println("자동차 3의 색상은 "+ myCar3.color);
		System.out.println("자동차 3의 속도는 "+ myCar3.speed +"km/h");
		
	}
}
