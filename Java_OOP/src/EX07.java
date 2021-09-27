class Car07 {
	private int speed;
	
	// 메소드에 상수화를 시키는 것.
	// 다른 클래스나 상속 받은 클래스에서 오버라이딩이 불가능하다.
	final void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan07 extends Car07 {
	
	// 상수화 시키면 '대문자'로 만들기
	static final String CAR_TYPE = "승용차";

}

public class EX07 {
	public static void main(String[] args) {
		
		Sedan07 sedan = new Sedan07();
		System.out.println(sedan.CAR_TYPE);
		sedan.upSpeed(150);
		
	}
}
