public abstract class Hero {
	String name;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(String name) {
		super();
		this.name = name;
	}
	
	abstract void attack();
}

class SuperMan extends Hero {
	@Override
	void attack() {
		System.out.println("���̷����� ����");
	}
	
	public SuperMan() {
		// TODO Auto-generated constructor stub
	}
	
	public SuperMan(String name) {
		super(name);
	}
}

class IronMan extends Hero {
	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("�� ������ ����");
	}
	
	public IronMan() {
		// TODO Auto-generated constructor stub
	}
	public IronMan(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
}

class Helk extends Hero {
	@Override
	void attack() {
		// TODO Auto-generated method stub
		System.out.println("�ѵ�� �б�");
	}
	
	public Helk() {
		// TODO Auto-generated constructor stub
	}
	public Helk(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
}