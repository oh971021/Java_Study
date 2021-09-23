public class Product {
	private String name;
	private int price;
	
	public Product() {}
		
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void info() {
		System.out.println("제품의 이름은 "+name+"입니다.");
		System.out.println("제품의 가격은 "+price+"원 입니다.");
	}
	
}
