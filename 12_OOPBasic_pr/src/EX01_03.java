
class Car03 {
	// 필드 앞에 private 를 사용하면 '은닉화' 의 개념이 적용된다.
	// 현 클라스 외 다른 클라스에선 사용할 수 없다.
	private String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	
}

public class EX01_03 {
	public static void main(String[] args) {
		Car03 myCar1 = new Car03();	
		
		// 필드값 private 설정 시 메소드로 접근한다.
		myCar1.setColor("노랑");
		// 필드값 public 일 경우 직접 접근이 가능하다.
		myCar1.speed = 0;

		myCar1.upSpeed(125);
		System.out.println(myCar1.getColor());
		System.out.println(myCar1.speed);
	}
}
