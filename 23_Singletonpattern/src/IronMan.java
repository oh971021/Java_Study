public class IronMan {
	private String name;
	private int age;
	
	private static final IronMan IRONMAN = new IronMan("토니스타크", 45);
	
	public static IronMan getTony() {
		return IRONMAN;
	}

	private IronMan() {}

	private IronMan(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }
	
	public void info() {
		System.out.printf("%s는 %d살 입니다.\n", name, age);
	}
	
}
