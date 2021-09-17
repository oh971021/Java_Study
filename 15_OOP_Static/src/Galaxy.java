public class Galaxy {
	private String name;
	private int price;
	private static final String MANU = "삼성";
	private static int count = 0;

	public Galaxy() {
		setCount(getCount() + 1);
	}
	
	public Galaxy(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		setCount(getCount() + 1);
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

	public static String getManu() {
		return MANU;
	}

	public void Info() {
		System.out.printf("품명 : %s, 가격 : %d, %s\n",getName(),getPrice(),getManu());
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Galaxy.count = count;
	}
}
