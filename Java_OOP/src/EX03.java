class Car03 {
	public Car03() {
		System.out.println("슈퍼 클래스 기본 생성자 (파라미터 없음)");
	}
	
	public Car03(String str) {
		System.out.println("슈퍼 클래스 오버로딩 생성자 (" + str + ")");
	}
}

class Sedan03 extends Car03 {

	public Sedan03() {
//		super(); // 상위 클래스의 기본 생성자는 굳이 작성해주지 않아도 됨.
		System.out.println("서브 클래스 기본 생성자 (파라미터 없음)");
	}
	
	public Sedan03(String str) {
		super(str);
		System.out.println("서브 클래스 오버로딩 생성자 (" + str + ")");
	}
	
}

public class EX03 {
	public static void main(String[] args) {
		
		Car03 car03 = new Car03();
		
		Sedan03 sedan03 = new Sedan03("저기요~");
	}
}
