public class Main_1 {
	public static void main(String[] args) {
		// ��� ���� ������
		// ����̶�� �Ӽ��� ��ӹ���
		// �Ϲݰ��� �����, ��޺��� ������
		
		Customer junseok = new Customer();
		junseok.name = "���ؼ�";
		junseok.age = 25;
		junseok.grade = 5;
		
		junseok.personInfo();
		junseok.customerInfo();
	}
}

class Person {
	String name;
	int age;
	
	void personInfo() {
		System.out.println("�̸� : "+name+", ���� : "+age);
	}
}

class Customer extends Person {
	int grade;
		
	void customerInfo() {
		if (grade > 4) {
			System.out.println("�̸� : "+name+", ���� : "+age+", ��� : "+grade+" { ������ ����� VIP�Դϴ�. }");
		} else {
			System.out.println("�̸� : "+name+", ���� : "+age+", ��� : "+grade+" { ������ ����� �Ϲ��Դϴ�. }");
		}
	}
}