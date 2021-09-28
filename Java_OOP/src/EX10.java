interface Car10 {
	// 인터페이스는 상수와 추상메소드밖에 만들지 못한다.
	
	// 상수의 public static final 은 생략도 가능하다
	String CAR_TYPE = "승용차";
	
	// 추상메소드는 body가 없다
	void work();
}

class Sedan10 implements Car10 {
	
	@Override
	public void work() {
		System.out.println("승용차가 사람을 태움");
	}
}

class Truck10 implements Car10 {
	
	@Override
	public void work() {
		System.out.println("트럭이 짐을 싣고 있음");
	}
}

public class EX10 {
	public static void main(String[] args) {
		
		
		
	}
}
