public class Pen extends Product {
	private String color;
	
	public Pen() {}
	
	public Pen(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("제품의 색깔은 "+color+"색 입니다.");
	}
}
