public class Practice01 {
	public static void main(String[] args) {
		/*
		 * �������� �����Դϴ�.
		 * ����̰� �����Դϴ�.
		 * �������� 8����
		 * ����̴� 13����
		 */
		
		Animal dog = new Animal();
		dog.kinds = "������";
		dog.age = 8;
		
		Animal cat = new Animal();
		cat.kinds = "�����";
		cat.age = 13;
		
		dog.Move();
		cat.Move();
		dog.Info();
		cat.Info();
	}
}

class Animal {
	String kinds;
	int age;
	
	// println �̳� printf ���� �������.
	void Move() {
		System.out.println(kinds+"�� �����Դϴ�.");
	}
	
	void Info() {
		System.out.printf("%s�� %d����\n", kinds, age);
	}
}
