public abstract class Students {
	private String name;
	private int age;
	
	public Students() {}
	
	protected Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// �߻� �޼ҵ�(�Խ�üũ) ����
	abstract void Ssig();
	
	// �߻� �޼ҵ�(���üũ) ����
	abstract void Fsig();
	
	// �⺻ ���� ��� �޼ҵ� ����
	void info() {
		System.out.println(name+"�� ���̴� "+age+"��");
	}
}

// �л� �� �Ѹ��� ¯�� ����
class JG extends Students {
	
	public JG() { super(); }
	
	public JG(String name, int age) { super(name, age); }

	// �߻� Ŭ������ �����Ѵ�
	@Override
	void Ssig() { System.out.println("�Խ� �Ϸ�"); }
	
	// �߻� Ŭ������ �����Ѵ�.
	@Override
	void Fsig() { System.out.println("��� �Ϸ�"); }
}