
class Car08 {
	private String color;
	private int speed;
	
	public Car08() {}
	
	public Car08(String color) {
		super();
		this.color = color;
	}
	
	public Car08(int speed) {
		super();
		this.speed = speed;
	}
	
	public Car08(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
}

public class EX01_08 {
	public static void main(String[] args) {
		Car08 myCar1 = new Car08();			
		Car08 myCar2 = new Car08("����");
		Car08 myCar3 = new Car08(20);
		Car08 myCar4 = new Car08("�Ķ�", 20);
		
		System.out.println("�ڵ��� 1 : "+myCar1.getColor()+" �ӵ��� : "+myCar1.getSpeed());
		System.out.println("�ڵ��� 2 : "+myCar2.getColor()+" �ӵ��� : "+myCar2.getSpeed());
		System.out.println("�ڵ��� 3 : "+myCar3.getColor()+" �ӵ��� : "+myCar3.getSpeed());
		System.out.println("�ڵ��� 4 : "+myCar4.getColor()+" �ӵ��� : "+myCar4.getSpeed());
	}
}
