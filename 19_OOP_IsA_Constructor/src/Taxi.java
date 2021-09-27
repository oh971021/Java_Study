
public class Taxi extends Car {
	private int price;

	public Taxi() {
		// TODO Auto-generated constructor stub
	}
	
	public Taxi(String model, String num, int price) {
		super(model, num);
		this.price = price;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("기본료는 "+price+"원 입니다");
	}
}
