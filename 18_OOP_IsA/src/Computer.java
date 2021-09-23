public class Computer extends Product {
	// 상속받은 값들 name, price
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
		System.out.println("제품의 CPU는 "+CPU+"hz입니다.");
		System.out.println("제품의 RAM는 "+RAM+"MB입니다.");
		System.out.println("제품의 HDD는 "+HDD+"GB입니다.");
	}
}
