
public class Notebook extends Product {
	private int battery;
	private int volume;
	
	public Notebook() {}
	
	public Notebook(String name, int price, int battery, int volume) {
		super(name, price);
		this.battery = battery;
		this.volume = volume;
	}
	
	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("��ǰ�� ���͸� ������ "+battery+"% �Դϴ�.");
		System.out.println("��ǰ�� �뷮�� "+volume+"GB�Դϴ�.");
	}
}
