// 인터페이스란 ?
// 객체와 객체를 연결해주는 매개체
// 인터페이스는 추상클래스와 같이 직접 객체 생성이 불가능하다.

// 다형성 (polymorphism)

interface Coffee {
	
	// interface 는 일반 메소드를 사용할 수 없어서
	// 메소드를 생성하면 abs-가 생략되어도 추상 메소드로 정의된다.
	abstract void name();
	void price();
	
	// 추상 클래스에서 구현 메소드를 정의하는 방법
	// default 메소드를 사용한다.
	default void HotorIced() {
		// 보통 질문이 필요한 사항만 default 메소드를 사용한다.
		System.out.println("물어봐야 되는 항목인가?");
	}; 
	
}

class Espresso implements Coffee {
	@Override
	public void name() {
		System.out.println("에스프레소");
	}

	@Override
	public void price() {
		System.out.println("2000원");
	}
}

class CafeLatte implements Coffee {
	@Override
	public void name() {
		System.out.println("카페라떼");
	}

	@Override
	public void price() {
		System.out.println("3000원");
	}
	@Override
	public void HotorIced() {
		Coffee.super.HotorIced();
		System.out.println("아이스? 따뜻한거?");
	}
}

class VanilaLatte implements Coffee {
	@Override
	public void name() {
		System.out.println("바닐라라떼");
	}

	@Override
	public void price() {
		System.out.println("3800원");
	}
	@Override
	public void HotorIced() {
		Coffee.super.HotorIced();
		System.out.println("아이스? 따뜻한거?");
	}
}

class Frappuccino implements Coffee {
	@Override
	public void name() {
		System.out.println("프라프치노");
	}

	@Override
	public void price() {
		System.out.println("5000원");
	}
}

public class OIMain_1 {
	public static void main(String[] args) {
		
		// 커피
		Coffee coffee;
			// 이름, 가격
		
		// 에스프레소
		coffee = new Espresso();	
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		// 카페라떼
		coffee = new CafeLatte();
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		// 바닐라라떼
		coffee = new VanilaLatte();
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		// 프라푸치노
		coffee = new Frappuccino();
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		/*
		// 에스프레소
		Espresso es = new Espresso();
		es.name();
		es.price();
		
		System.out.println("===========");
		
		// 카페라떼
		CafeLatte ca = new CafeLatte();
		ca.name();
		ca.price();
		
		System.out.println("===========");
		
		// 바닐라라떼
		VanilaLatte va = new VanilaLatte();
		va.name();
		va.price();
		
		System.out.println("===========");
		
		// 프라푸치노
		Frappuccino fr = new Frappuccino();
		fr.name();
		fr.price();
		*/
	}
}
