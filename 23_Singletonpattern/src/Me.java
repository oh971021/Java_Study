
public class Me {
	private String name;
	private int age;
	

	// 다른 클래스에서는 접근할 수 없어서, 현 클래스 내에서 
	// 객체를 생성해준다.
	// Singleton Pattern : 같은 클래스 내에 모든 생성자를 private으로 만들고,
	// 다른 클래스에서는 Getter로 접근한다. new로는 접근 불가능하다.
	// 단일 객체만 존재해야하는 경우 사용한다.
	private static final Me ME = new Me("준석", 25);
	
	public static Me getMe() { return ME; }

	private Me() {}
	
	private Me(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }
	
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
	
}
