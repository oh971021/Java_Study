
public class Person {
	String name;
	String gender;
	
	//�⺻ ������ : �����ڸ� ���� �Ȱǵ帮�� �ڵ����� �������
	//			�����ε� �����ڸ� ��������� �ڵ����� �������
	//�Ⱥ����� �ִ°�. �ٵ� '����' �־�� �Ǵѱ� ����ȭ ��Ų��
	public  Person() {
		// ���ǻ��� : Spring..�� ..�ڹ� ��ü�� �ڵ����� ������ִ� ���� ���� �� �� �⺻�����ڸ� ���
		//�׷��� �� �⺻�����ڸ� ���� ����. java���� ������ ������
		//�ٸ� ���α׷� ���ִ�? ������ ������ �׳� ����°� ����ȭ
		System.out.println("����");
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("����");
	}
	
	
}
