
public class OMain_1 {
	public static void main(String[] args) {
		// 애플 쇼핑몰

		// Goods를 사자!

		/*
		 * Products.getname();
		 * 
		 * 클래스는 객체를 생성하지않으면 클래스 내의 메소드에 접근할 수 없다.
		 * 클래스는 속성과 기능만을 가지고 있기때문에 그 것을 활용할 객체를 만들고,
		 * 그 객체를 통해 접근하는게 가능하다.
		 * */
		
		// 1. 제조사는 애플로 고정
		// 2. 상품 정보 출력기능(공통)

		// 아이폰, 120만원, 애플
		Products iphone = new Products("아이폰", 120);
		iphone.Info();

		// 아이패드, 80만원, 애플
		Products ipad = new Products("아이패드", 80);
		ipad.Info();
		
		// 에어팟, 20만원, 애플
		Products airpot = new Products("에어팟", 20);
		airpot.Info();
		
		// Plus@ : 한번 생성한 제품의 이름과 가격은 수정이 안되게
		// => 세터를 없애준다.
		
		System.out.println(Products.getMaker());
	}
}
