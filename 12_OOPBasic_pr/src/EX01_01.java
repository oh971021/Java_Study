
class Car {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	
	void downSpeed(int value) {
		speed = speed - value;
	}
	
}


public class EX01_01 {
	public static void main(String[] args) {
	
		// �ڵ����� ����� ����
		// 1. Ŭ���� ����
		// 2. �Ӽ� �� ��� ����
		// 3. Main ���� ��ü ����
		
		Car myCar1 = new Car();	// ���� �ڵ���(��ü)�� ������ �ڵ�
		myCar1.color = "����";
		myCar1.speed = 0;
		
		Car myCar2 = new Car();
		myCar2.color = "�Ƹ����׷���";
		myCar2.speed = 0;

		Car myCar3 = new Car();
		myCar3.color = "����";
		myCar3.speed = 0;
		
		myCar1.upSpeed(120);
		System.out.println("�ڵ��� 1�� ������ "+ myCar1.color);
		System.out.println("�ڵ��� 1�� �ӵ��� "+ myCar1.speed +"km/h");
		
		myCar2.upSpeed(150);
		System.out.println("�ڵ��� 2�� ������ "+ myCar2.color);
		System.out.println("�ڵ��� 2�� �ӵ��� "+ myCar2.speed +"km/h");

		myCar3.upSpeed(80);
		System.out.println("�ڵ��� 3�� ������ "+ myCar3.color);
		System.out.println("�ڵ��� 3�� �ӵ��� "+ myCar3.speed +"km/h");
		
	}
}
