
class Car04 {
	// 필드 앞에 private 를 사용하면 '은닉화' 의 개념이 적용된다.
	// 현 클라스 외 다른 클라스에선 사용할 수 없다.
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

public class EX01_04 {
	public static void main(String[] args) {
		Car04 myCar1 = new Car04();	
		
		// 노랑, 0km/h 
		myCar1.setColor("노랑");
		myCar1.setSpeed(0);
		// 색, 속도 출력
		System.out.println(myCar1.getColor());
		System.out.println(myCar1.getSpeed());
	}
}
