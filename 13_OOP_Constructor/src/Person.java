public class Person {
	private String name;
	private String gender;
	
	// �⺻ ������ : �����ڸ� ���� �ǵ帮�� ������ �ڵ����� ����� ��.
	// 			  �����ε� �����ڸ� ������ٸ� �ڵ����� ��������� ����.
	public Person() { // '����ȭ' ��Ų ������
	// ���ǻ��� : Spring .. �� �ڹ� ��ü�� �ڵ����� ����� �ִ� ���� ���� �� �� �⺻ �����ڸ� ���
	//			�׷��� �� �⺻ �����ڸ� ���� ������ �߻��Ѵ�. Java ���� ������ ������
	//			�ٸ� ���α׷��� ������ �� ������ ���� �� �ֱ� ������
	//			�����ڸ� ����� ���� ����ȭ�ϴ� ���� ����.
		System.out.println("����");
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("����");
	}
}
