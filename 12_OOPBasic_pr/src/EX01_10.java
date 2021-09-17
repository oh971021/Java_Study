
// Static 예제

class Car10 {
	String color;
	int speed;
	static int count = 0;
	// int count =0; // 요렇게 선언하면 자원이 stack에 위치해있어서 
	// 생성자에서 ++해도 증가하지 않는다.
	static String car_Type = "승용차";

	public Car10() {
		count++;
	}
}

public class EX01_10 {
	public static void main(String[] args) {
		Car10 myCar1 = new Car10();			
		System.out.println(myCar1);
		System.out.println("현재 생성 된 차량의 수 : "+ myCar1.count);

		Car10 myCar2 = new Car10();			
		System.out.println(myCar2);
		System.out.println("현재 생성 된 차량의 수 : "+ myCar2.count);

		Car10 myCar3 = new Car10();			
		System.out.println(myCar3);
		System.out.println("현재 생성 된 차량의 수 : "+ myCar3.count);
		
		System.out.println(myCar1.count);
		System.out.println(Car10.count);
		System.out.println(Car10.car_Type);
	}
}
