public class Person {
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void info() {
		System.out.println("안녕하세요. 제 이름은 "+name+"이라고 합니다.");
		System.out.println("나이는 "+age+"살 입니다.");
	}
	
}
