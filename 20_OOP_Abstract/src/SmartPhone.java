public class SmartPhone {
	public static void main(String[] args) {
		
		// ����Ʈ��
			// �𵨸�, �÷�, ����, ����
			// ���� ��� (����)
		
		// �Ϲ�
			// ��� : ��ȭ, SNS, ���ͳ�, ����
		
		// ������6S
		Iphone i = new Iphone("������6S", "�����̽��׷���", 150, 600);
		i.info();
		i.call();
		i.sns();
		
		// �ַ���20
		Galaxy g = new Galaxy("�ַ���20", "��޺��", 130, 600);
		g.info();
		g.net();
		g.game();
	}
}

abstract class Phone {
	protected String model;
	protected String color;
	protected int price;
	protected double weight;
	
	public Phone() {}
	
	public Phone(String model, String color, int price, int weight) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
		this.weight = weight;
	}

	abstract void info();
	
	void call() {	System.out.println("��ȭ�� �̴ϴ�");	}
	void sns() {	System.out.println("SNS�� �մϴ�");	}
	void net() {	System.out.println("���ͳݿ� �����մϴ�");	}
	void game() {	System.out.println("������ �մϴ�");	}	
}

class Iphone extends Phone {

	public Iphone() {}
	
	public Iphone(String model, String color, int price, int weight) {
		super(model, color, price, weight);
	}

	@Override
	void info() {	
		System.out.printf("%s�� %s���̰�, %d�� �Դϴ�. ���Դ� %dg�Դϴ�.\n",	
				this.model, this.color, this.price,this.weight);
		}	
}

class Galaxy extends Phone {

	public Galaxy() {}
	
	public Galaxy(String model, String color, int price, int weight) {
		super(model, color, price, weight);
	}
	
	@Override
	void info() {	
		System.out.printf("%s�� %s���̰�, %d�� �Դϴ�. ���Դ� %dg�Դϴ�.\n",	
				this.model, this.color, this.price,this.weight);
		}
	
}