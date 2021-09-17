
class Car06 {
	private String color;
	private int speed;
	
	// 생성자 : 기본 값 셋팅할 때 사용 되는 메소드
	public Car06() {
		color = "빨강";
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
		
		System.out.println("자동차 1 : "+myCar1.getColor()+" 속도는 : "+myCar1.getSpeed());
		System.out.println("자동차 2 : "+myCar2.getColor()+" 속도는 : "+myCar2.getSpeed());
	}
}
