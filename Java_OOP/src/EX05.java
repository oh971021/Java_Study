class Car05 {
	protected String color;	// ĸ��ȭ�� ��ӵ� �Ұ����ϴ�.
	public int speed;
	
	public Car05() {}
}

class Sedan05 extends Car05 {
	public Sedan05() {}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void setColor(String color) {
		this.color = color;
	}
}

public class EX05 {
	public static void main(String[] args) {
		
		Sedan05 sedan05 = new Sedan05();
		sedan05.setSpeed(100);
		sedan05.setColor("����");
		System.out.println("�¿����� �ӵ��� "+sedan05.speed+"km/h");
		System.out.println("�¿����� ������ "+sedan05.color+"��");
		
	}
}
