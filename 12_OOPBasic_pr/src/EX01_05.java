
class Car05 {
	// �ʵ� �տ� private �� ����ϸ� '����ȭ' �� ������ ����ȴ�.
	// �� Ŭ�� �� �ٸ� Ŭ�󽺿��� ����� �� ����.
	private int speed = 0;
	private int Maxspeed = 300;
	private int Minspeed = 0;
	
	void upSpeed(int value) {
		System.out.println("�Ǽ��� ����ϴ�");
		if (speed + value > Maxspeed) {
			speed = Maxspeed;
			System.out.println("�ְ�ӵ� �Դϴ�. ���� �ӵ��� "+getSpeed()+"km/h");
		} else {
			speed = speed + value;
			System.out.println("���� �ӵ��� "+getSpeed()+"km/h");
		}
	}		
	
	void downSpeed(int value) {
		System.out.println("�극��ũ�� ����ϴ�.");
		if (speed - value < Minspeed) {
			speed = Minspeed;
			System.out.println("���� �ӵ��� "+getSpeed()+"km/h");
		} else {
			speed = speed - value;
			System.out.println("���� �ӵ��� "+getSpeed()+"km/h");
		}
	}

	int getSpeed() {
		return speed;
	}

//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
}

public class EX01_05 {
	public static void main(String[] args) {
		Car05 myCar1 = new Car05();			
		
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		myCar1.upSpeed(1000);
		
		myCar1.downSpeed(200);
		myCar1.downSpeed(200);
		
	}
}
