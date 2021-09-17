
class Car07 {
	private String color;
	private int speed;
	
	public Car07() {}
	
	public Car07(String color, int speed) {
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

public class EX01_07 {
	public static void main(String[] args) {
		Car07 myCar1 = new Car07("파랑", 0);			
		Car07 myCar2 = new Car07();
		
		System.out.println("자동차 1 : "+myCar1.getColor()+" 속도는 : "+myCar1.getSpeed());
		System.out.println("자동차 2 : "+myCar2.getColor()+" 속도는 : "+myCar2.getSpeed());
	}
}
