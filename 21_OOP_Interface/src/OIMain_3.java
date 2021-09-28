import java.util.Scanner;

// 인터페이스란 ?
// 객체와 객체를 연결해주는 매개체
// 인터페이스는 추상클래스와 같이 직접 객체 생성이 불가능하다.

// 다형성 (polymorphism)

interface Coffee3 {
	
	// interface 는 일반 메소드를 사용할 수 없어서
	// 메소드를 생성하면 abs-가 생략되어도 추상 메소드로 정의된다.
	abstract void name();
	void price();
	
	// 추상 클래스에서 구현 메소드를 정의하는 방법
	// default 메소드를 사용한다.
	default void HotorIced() {
		// 보통 질문이 필요한 사항만 default 메소드를 사용한다.
		System.out.println("1. Hot?  2. Iced?");
	}; 
	
	default void choice(int a) {
		if (a == 1) {
			System.out.print("따뜻한 ");
		} else if (a == 2) {
			System.out.print("차가운 ");
		} else {
			System.out.println("선택하지않으면 아이스입니다.");
			System.out.print("차가운 ");
		}
	}
}

class Espresso3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("에스프레소");
	}

	@Override
	public void price() {
		System.out.println("2000원");
	}
}

class CafeLatte3 implements Coffee3 {
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
		Coffee3.super.HotorIced();
	}
	@Override
	public void choice(int a) {
		Coffee3.super.choice(a);
	}
}

class VanilaLatte3 implements Coffee3 {
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
		Coffee3.super.HotorIced();
	}
	@Override
	public void choice(int a) {
		Coffee3.super.choice(a);
	}
}

class Frappuccino3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("프라프치노");
	}

	@Override
	public void price() {
		System.out.println("5000원");
	}
}

public class OIMain_3 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hi; 	// 핫, 아이스 선택한 값 받는 변수
		// 콘솔에 안내해주세요
		while (true) {
			// 주문 하시겠어요?
			System.out.println("주문 하시겠어요?");
			
			// 1. 에스프레소  2. 카페라떼  3. 바닐라라떼  4. 프라푸치노
			System.out.println("1. 에스프레소  2. 카페라떼  3. 바닐라라떼  4. 프라푸치노  5. 돈이 없어요..");
			
			// 메뉴 선택 ( what )
			int what = s.nextInt();
			
			// 그릇 만들기
			Coffee3 coffee = null;
	
			if (what == 1) {
				coffee = new Espresso3();

			} else if (what == 2) {
				coffee = new CafeLatte3();

			} else if (what == 3) {
				coffee = new VanilaLatte3();

			} else if (what == 4) {
				coffee = new Frappuccino3();
				
			} else if (what == 5) {
				System.out.println("그냥 가세요~");
				break;
				
			} else {
				System.out.println("메뉴판에 없습니다.");
				continue;
			}
			
			if (what == 2 || what ==3) {
				coffee.HotorIced();
				// 따뜻한거, 차가운거 입력받기
				hi = s.nextInt();
				// 선택사항에 맞춰 출력
				if (hi == 1) {
					System.out.println("따뜻한");
				} else if (hi == 2) {
					System.out.println("차가운");
				} else {
					System.out.println("선택하지않으면 아이스입니다.");
					System.out.println("차가운");
				}
			} 
			coffee.name();
			coffee.price();
		}	
	}
}
