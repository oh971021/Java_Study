// JavaBean : get, set �޼ҵ带 ������ �ִ� Class
public class Products {
	private String items;
	private int price;
	// ����� �빮�ڷ� ���ִ°� ����
	private static final String MAKER = "����";
	
	public Products() {}
	
	// ��ü�� ���� ��, ���� ������ �� �ִ� ��� 2����
	// 1. ������ : ������ ���ÿ� ����
	// 2. ���� : ���� �Ŀ��� ���� ����
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
		System.out.printf("%s�� ������ %d, ������� %s�Դϴ�.\n", getItems(),getPrice(),getMaker());
	}
	
	
}
