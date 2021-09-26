import java.util.Scanner;

public class Main_3 {
	public static void main(String[] args) {
	
		// 무엇을 만들어 볼까요?
		// OOP, 캡슐, Override, Overload 사용하기!
		
		// 아이패드라는 큰 카테고리
		Ipad one = new Ipad();
			// 가격, 색상
			one.setPrice(790000);
			one.setColor("skyblue");
			one.info();
			
		// 애플펜슬 부수 제품 = 가격, 색상 정하기
		ApplePen one_pen = new ApplePen("하얀색", 150000);
			// 아이패드에 글을 쓰는 기능
			one_pen.write();
			one_pen.info();
			
		// 충전기
		Charger one_char = new Charger("하얀색", 35000);
			// 아이패드를 충전시키는 기능
			one_char.charge();
			one_char.info();
		
	}
}

class Ipad {
	private String color;
	private int price;
	
	public Ipad() {}
	
	public Ipad(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void info() {
		System.out.printf("가격은 %d, 색상은 %s\n", getPrice(), getColor());
	}
	
}

class ApplePen extends Ipad {
	
	public ApplePen() {}
	
	public ApplePen(String color, int price) {
		this.setColor(color);
		this.setPrice(price);
	}
	
	Scanner s = new Scanner(System.in);
	
	public void write() {
		String a;
		
		System.out.print("문구 작성 : ");
		a = s.nextLine();
		System.out.println(a);
	}
	
}

class Charger extends Ipad {
	
	public Charger() {
		// TODO Auto-generated constructor stub
	}
	
	public Charger(String color, int price) {
		this.setColor(color);
		this.setPrice(price);
	}
	
	public void charge() {
		System.out.println("충전합니다");
	}

}