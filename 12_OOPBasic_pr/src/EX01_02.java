
class Car02 {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}

	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}

}

public class EX01_02 {
	public static void main(String[] args) {
	
		// �ڵ����� ����� ����
		// 1. Ŭ���� ����
		// 2. �Ӽ� �� ��� ����
		// 3. Main ���� ��ü ����
		
		Car02 myCar1 = new Car02();	// ���� �ڵ���(��ü)�� ������ �ڵ�
		myCar1.color = "����";
		myCar1.speed = 0;

		System.out.println(myCar1.color);
		System.out.println(myCar1.getColor());
		System.out.println(myCar1.getSpeed());
	}
}
