class Car02 {
	
	public Car02() {
		System.out.println("슈퍼 클래스 생성자 호출!");
	}
}

class Sedan02 extends Car02 {
	
	public Sedan02() {
		System.out.println("서브 클래스 생성자 호출!");
	}
}

public class EX02 {
	public static void main(String[] args) {
		
		Sedan02 sedan02 = new Sedan02();
		
	}
}
