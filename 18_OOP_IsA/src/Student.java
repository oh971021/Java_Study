
// student is a human (o)
// human is a student (x)

// Person : ����(super) Ŭ����
// Student : ����(sub) Ŭ����

// �� ���谡 �����ϴ� ���� 'Is A' ��� �Ѵ� (��Ӱ���)

public class Student extends Person {
	// Person�� �ִ� �ʵ� ��, �޼ҵ� ���� ��� �����ϴ�.
	
	// �̸�, ����, �Ͼ� ����
	private int jpscore;
	
	public Student() {}
	
	public Student(int jpscore) {
		super();
		this.jpscore = jpscore;
	}
	
	public int getJpscore() {
		return jpscore;
	}

	public void setJpscore(int jpscore) {
		this.jpscore = jpscore;
	}

	// ���� �޴� �޼ҵ尡 ����� ������ ��,
	// �������̵����� �޼ҵ带 ������ ���ش�.
	// �����ε��� �򰥸��� ����~

	// �ڱ�Ұ�
	@Override
	public void info() {
		// super : ����Ŭ���� (�θ�Ŭ����) �� ����.
		super.info();
		System.out.println("�Ͼ� ������ "+jpscore+"�� �Դϴ�.");
	}
}