
class Car06 {
	private String color;
	private int speed;
	
	// ������ : �⺻ �� ������ �� ��� �Ǵ� �޼ҵ�
	public Car06() {
		color = "����";
		speed = 0;
	}
	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	
}

public class EX01_06 {
	public static void main(String[] args) {
		Car06 myCar1 = new Car06();			
		Car06 myCar2 = new Car06();
		
		System.out.println("�ڵ��� 1 : "+myCar1.getColor()+" �ӵ��� : "+myCar1.getSpeed());
		System.out.println("�ڵ��� 2 : "+myCar2.getColor()+" �ӵ��� : "+myCar2.getSpeed());
	}
}
