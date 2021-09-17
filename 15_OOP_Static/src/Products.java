// JavaBean : get, set 메소드를 가지고 있는 Class
public class Products {
	private String items;
	private int price;
	// 상수는 대문자로 써주는게 국룰
	private static final String MAKER = "애플";
	
	public Products() {}
	
	// 객체를 만들 때, 값을 설정할 수 있는 방법 2가지
	// 1. 생성자 : 생성과 동시에 설정
	// 2. 세터 : 생성 후에도 값을 변경
	public Products(String items, int price) {
		super();
		this.items = items;
		this.price = price;
	}
	
	public void setItems(String items) {
		this.items = items;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getItems() {
		return items;
	}

	public int getPrice() {
		return price;
	}
	
	public static String getMaker() {
		return MAKER;
	}

	public void Info() {
		System.out.printf("%s의 가격은 %d, 제조사는 %s입니다.\n", getItems(),getPrice(),getMaker());
	}
	
	
}
