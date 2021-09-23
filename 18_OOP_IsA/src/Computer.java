public class Computer extends Product {
	// ��ӹ��� ���� name, price
	private double CPU;
	private int RAM;
	private int HDD;
	
	public Computer() {}
	
	public Computer(String name, int price,double CPU, int RAM, int HDD) {
		super(name, price);
		this.CPU = CPU;
		this.RAM = RAM;
		this.HDD = HDD;
	}
	
	public double getCPU() {
		return CPU;
	}

	public void setCPU(double cPU) {
		CPU = cPU;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getHDD() {
		return HDD;
	}

	public void setHDD(int hDD) {
		HDD = hDD;
	}

	@Override
	public void info() {
		super.info();
		System.out.println("��ǰ�� CPU�� "+CPU+"hz�Դϴ�.");
		System.out.println("��ǰ�� RAM�� "+RAM+"MB�Դϴ�.");
		System.out.println("��ǰ�� HDD�� "+HDD+"GB�Դϴ�.");
	}
}
