import java.util.Scanner;

public class Main_3 {
	public static void main(String[] args) {
	
		// ������ ����� �����?
		// OOP, ĸ��, Override, Overload ����ϱ�!
		
		// �����е��� ū ī�װ�
		Ipad one = new Ipad();
			// ����, ����
			one.setPrice(790000);
			one.setColor("skyblue");
			one.info();
			
		// �����潽 �μ� ��ǰ = ����, ���� ���ϱ�
		ApplePen one_pen = new ApplePen("�Ͼ��", 150000);
			// �����е忡 ���� ���� ���
			one_pen.write();
			one_pen.info();
			
		// ������
		Charger one_char = new Charger("�Ͼ��", 35000);
			// �����е带 ������Ű�� ���
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
		System.out.printf("������ %d, ������ %s\n", getPrice(), getColor());
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
		
		System.out.print("���� �ۼ� : ");
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
		System.out.println("�����մϴ�");
	}

}