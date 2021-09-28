import java.util.Scanner;

// 인터페이스란 ?
// 객체와 객체를 연결해주는 매개체
// 인터페이스는 추상클래스와 같이 직접 객체 생성이 불가능하다.

// 다형성 (polymorphism)

interface Coffee2 {
	
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

class Espresso2 implements Coffee2 {
	@Override
	public void name() {
		System.out.println("에스프레소");
	}

	@Override
	public void price() {
		System.out.println("2000원");
	}
}

class CafeLatte2 implements Coffee2 {
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
		Coffee2.super.HotorIced();
		System.out.println("아이스? 따뜻한거?");
	}
}

class VanilaLatte2 implements Coffee2 {
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
		Coffee2.super.HotorIced();
		System.out.println("아이스? 따뜻한거?");
	}
}

class Frappuccino2 implements Coffee2 {
	@Override
	public void name() {
		System.out.println("프라프치노");
	}

	@Override
	public void price() {
		System.out.println("5000원");
	}
}

public class OIMain_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hi;
		boolean run = true;
		// 콘솔에 안내해주세요
		while (run) {
			// 주문 하시겠어요?
			System.out.println("주문 하시겠어요?");
			// 1. 에스프레소  2. 카페라떼  3. 바닐라라떼  4. 프라푸치노
			System.out.println("1. 에스프레소  2. 카페라떼  3. 바닐라라떼  4. 프라푸치노  \n5. 돈이 없어요..");
			int what = s.nextInt();
			// 5번 입력시 그냥가세요~
			switch (what) {
			case 1:
				Espresso2 es = new Espresso2();
				es.name();
				es.price();
				run = false;
				break;
			case 2:
				System.out.println("1. Hot  2. Iced");
				hi = s.nextInt();
				if (hi == 1) {
					System.out.println("따뜻한");
				} else if (hi == 2) {
					System.out.println("차가운");
				} else {
					System.out.println("선택하지않으면 아이스입니다.");
					System.out.println("차가운");
				}
				CafeLatte2 ca = new CafeLatte2();
				ca.name();
				ca.price();
				run = false;
				break;
			case 3:
				System.out.println("1. Hot  2. Iced");
				hi = s.nextInt();
				if (hi == 1) {
					System.out.println("따뜻한");
				} else if (hi == 2) {
					System.out.println("차가운");
				} else {
					System.out.println("선택하지않으면 아이스입니다.");
					System.out.println("차가운");
				}
				VanilaLatte2 va = new VanilaLatte2();
				va.name();
				va.price();
				run = false;
				break;
			case 4:
				Frappuccino2 fr = new Frappuccino2();
				fr.name();
				fr.price();
				run = false;
				break;
			case 5:
				System.out.println("그냥 가세요~");
				run = false;
				break;	
			default:
				System.out.println("메뉴판에 없네요");
				break;
			}
		}
	}
}
