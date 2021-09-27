public class Car {
	private String model;
	private String num;
	
	public Car() {}

	public Car(String model, String num) {
		super();
		this.model = model;
		this.num = num;
	}

	public void info() {
		System.out.printf("======%s======\n차량 번호는 %s\n", model, num);
	}
}
