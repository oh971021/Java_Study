class Car04 {
	private String color;	// 캡슐화는 상속도 불가능하다.
	int speed;
	
	public Car04() {}
}

class Sedan04 extends Car04 {
	public Sedan04() {}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
//	void setColor(String color) {
//		
//	}
}

public class EX04 {
	public static void main(String[] args) {
		
		Sedan04 sedan04 = new Sedan04();
		sedan04.setSpeed(100);
		System.out.println("승용차의 속도는 "+sedan04.speed+"km/h");
		
	}
}
