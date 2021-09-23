public class Calculator {
	
	// 표현 해야 할 속성이 없는가 확인한다
	// 1. 없으면 필드를 정의할 필요가 없다 - 객체 생성 필요없음(메소드는 static으로 만들어서 클래스로 접근하도록 한다)
	// 2. 있으면 필드를 정의한다 - 객체 생성해서 접근
	
	// Method에 Static을 붙이는 이유?
	// 객체를 생성하지 않고, 사용을 하려고 붙인다.
		// 안붙이면 객체를 생성하지않으면 사용하지 못한다.
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void min(int a, int b) {
		System.out.println(a-b);
	}
	
}