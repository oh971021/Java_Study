public class Main_2 {
	public static void main(String[] args) {
		Snack s = new Snack();
		s.broken();
		
		System.out.println("=================");
		
		Chocolate c = new Chocolate();
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.taste);
		c.broken();
		c.eat();
		c.Info();
		
		System.out.println("\n=================");
		
		Chocolate c2 = new Chocolate("������", 1500, "����");
		c2.Info();
	}
}

// �θ� Ŭ����
class Snack {
	String name;
	int price;
	
	
	public Snack() {}
	
	public Snack(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	void broken() {
		System.out.println("���ڰ� �μ����ϴ�.");
	}
}

// �ڽ� Ŭ����
class Chocolate extends Snack{
	String taste;
	
	public Chocolate() {}
	
	public Chocolate(String name, int price, String taste) {
		super();
		this.name = name;
		this.price = price;
		this.taste = taste;
	}
	
	void eat() {
		System.out.println("�Խ��ϴ�.");
	}
	
	void Info() {
		System.out.printf("���ڸ� : %s, ���� : %d, �� : %s", name,price,taste);
	}
}
