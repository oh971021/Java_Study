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
		System.out.printf("======%s======\n���� ��ȣ�� %s\n", model, num);
	}
}
