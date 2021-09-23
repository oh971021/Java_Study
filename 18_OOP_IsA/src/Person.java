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
		System.out.println("�ȳ��ϼ���. �� �̸��� "+name+"�̶�� �մϴ�.");
		System.out.println("���̴� "+age+"�� �Դϴ�.");
	}
	
}
