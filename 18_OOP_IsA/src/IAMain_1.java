public class IAMain_1 {
	public static void main(String[] args) {
		// ��� = �̸�, ����, �ڱ�Ұ�
		// �ؼ�, 25, �ڱ�Ұ�
		
		Person p = new Person("�ؼ�", 25);
		
		p.info();
		
		System.out.println("===============================");
		
		// �л� = �̸�, ����, �Ϻ��� ����
		// �ڱ�Ұ� ��� ����
				// �ع�, 26, 99
		
		Student s = new Student(99);
		s.setName("�ع�");
		s.setAge(26);
		
		s.info();
		
		System.out.println("===============================");
		
		// ���� = �̸�, ����, ������
		// �ڱ�Ұ� ��� ����
				// mz, 27, java
		
		Teacher t = new Teacher("JAVA");
		t.setName("����");
		t.setAge(27);
		
		t.info();
		
		System.out.println("===============================");
	}
}
