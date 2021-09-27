public class Bus extends Car {
	private int busnum;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String model, String num, int busnum) {
		super(model, num);
		this.busnum = busnum;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.printf("노선번호는 "+busnum+" 입니다");
	}
}
