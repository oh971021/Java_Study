public class Practice02 {
	public static void main(String[] args) {
		// �ʵ忡 ���� �������� ���ϰ� �����ּ���
		
		Animal02 dog = new Animal02();
		dog.setKinds("������");
		dog.setAge(8);
		
		Animal02 cat = new Animal02();
		cat.setKinds("�����");
		cat.setAge(13);
		
		dog.Move();
		cat.Move();
		
		System.out.printf("%s�� %d���� �Դϴ�.\n", dog.getKinds(), dog.getAge());
		System.out.printf("%s�� %d���� �Դϴ�.\n", cat.getKinds(), cat.getAge());
	}
}

class Animal02 {
	private String kinds;
	private int age;
	
	void Move() {
		System.out.println(kinds+"�� �����Դϴ�.");
	}	
	
	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
