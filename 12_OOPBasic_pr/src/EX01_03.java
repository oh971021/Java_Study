
class Car03 {
	// �ʵ� �տ� private �� ����ϸ� '����ȭ' �� ������ ����ȴ�.
	// �� Ŭ�� �� �ٸ� Ŭ�󽺿��� ����� �� ����.
	private String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}

	void setColor(String color) {
		this.color = color;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	
}

public class EX01_03 {
	public static void main(String[] args) {
		Car03 myCar1 = new Car03();	
		
		// �ʵ尪 private ���� �� �޼ҵ�� �����Ѵ�.
		myCar1.setColor("���");
		// �ʵ尪 public �� ��� ���� ������ �����ϴ�.
		myCar1.speed = 0;

		myCar1.upSpeed(125);
		System.out.println(myCar1.getColor());
		System.out.println(myCar1.speed);
	}
}
