class Car06 {
	int speed;
	
	public Car06() {
		// TODO Auto-generated constructor stub
	}

	public Car06(int speed) {
		super();
		this.speed = speed;
	}
	
	void upSpeed(int speed) {
		this.speed += speed;
		System.out.println("����ӵ�(��Ŭ) => "+this.speed);	// + �ӵ�����
	}
}

class Truck06 extends Car06 {
	
	@Override
	void upSpeed(int speed) {
		// TODO Auto-generated method stub
		super.upSpeed(speed);
		if (this.speed > 150) {
			this.speed = 150;
			System.out.printf("���Ѽӵ��� %dkm/h �Դϴ�.\n", this.speed);
		}
	}
}

class Sedan06 extends Car06 {
	
	@Override
	void upSpeed(int speed) {
		// TODO Auto-generated method stub
		super.upSpeed(speed);
		if (this.speed > 200) {
			this.speed = 200;
			System.out.printf("���Ѽӵ��� %dkm/h �Դϴ�.\n", this.speed);
		}
		super.upSpeed(speed);
	}
}

public class EX06 {
	public static void main(String[] args) {
		
		// ����Ŭ���� ���ǵ� : 1000
		// Ʈ�� �ְ�ӵ� : 150
		// ���� �ְ�ӵ� : 200
		
		Truck06 truck = new Truck06();
		Sedan06 sedan = new Sedan06();
		
		truck.upSpeed(150);
		sedan.upSpeed(200);
		
	}
}
