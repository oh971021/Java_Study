
class Car04 {
	// �ʵ� �տ� private �� ����ϸ� '����ȭ' �� ������ ����ȴ�.
	// �� Ŭ�� �� �ٸ� Ŭ�󽺿��� ����� �� ����.
	private String color;
	private int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

public class EX01_04 {
	public static void main(String[] args) {
		Car04 myCar1 = new Car04();	
		
		// ���, 0km/h 
		myCar1.setColor("���");
		myCar1.setSpeed(0);
		// ��, �ӵ� ���
		System.out.println(myCar1.getColor());
		System.out.println(myCar1.getSpeed());
	}
}
