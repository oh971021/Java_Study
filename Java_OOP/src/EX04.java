class Car04 {
	private String color;	// ĸ��ȭ�� ��ӵ� �Ұ����ϴ�.
	int speed;
	
	public Car04() {}
}

class Sedan04 extends Car04 {
	public Sedan04() {}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
//	void setColor(String color) {
//		
//	}
}

public class EX04 {
	public static void main(String[] args) {
		
		Sedan04 sedan04 = new Sedan04();
		sedan04.setSpeed(100);
		System.out.println("�¿����� �ӵ��� "+sedan04.speed+"km/h");
		
	}
}
