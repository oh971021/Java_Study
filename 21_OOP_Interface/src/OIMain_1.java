// �������̽��� ?
// ��ü�� ��ü�� �������ִ� �Ű�ü
// �������̽��� �߻�Ŭ������ ���� ���� ��ü ������ �Ұ����ϴ�.

// ������ (polymorphism)

interface Coffee {
	
	// interface �� �Ϲ� �޼ҵ带 ����� �� ���
	// �޼ҵ带 �����ϸ� abs-�� �����Ǿ �߻� �޼ҵ�� ���ǵȴ�.
	abstract void name();
	void price();
	
	// �߻� Ŭ�������� ���� �޼ҵ带 �����ϴ� ���
	// default �޼ҵ带 ����Ѵ�.
	default void HotorIced() {
		// ���� ������ �ʿ��� ���׸� default �޼ҵ带 ����Ѵ�.
		System.out.println("������� �Ǵ� �׸��ΰ�?");
	}; 
	
}

class Espresso implements Coffee {
	@Override
	public void name() {
		System.out.println("����������");
	}

	@Override
	public void price() {
		System.out.println("2000��");
	}
}

class CafeLatte implements Coffee {
	@Override
	public void name() {
		System.out.println("ī���");
	}

	@Override
	public void price() {
		System.out.println("3000��");
	}
	@Override
	public void HotorIced() {
		Coffee.super.HotorIced();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

class VanilaLatte implements Coffee {
	@Override
	public void name() {
		System.out.println("�ٴҶ��");
	}

	@Override
	public void price() {
		System.out.println("3800��");
	}
	@Override
	public void HotorIced() {
		Coffee.super.HotorIced();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

class Frappuccino implements Coffee {
	@Override
	public void name() {
		System.out.println("������ġ��");
	}

	@Override
	public void price() {
		System.out.println("5000��");
	}
}

public class OIMain_1 {
	public static void main(String[] args) {
		
		// Ŀ��
		Coffee coffee;
			// �̸�, ����
		
		// ����������
		coffee = new Espresso();	
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		// ī���
		coffee = new CafeLatte();
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		// �ٴҶ��
		coffee = new VanilaLatte();
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		// ����Ǫġ��
		coffee = new Frappuccino();
		coffee.name();
		coffee.price();
		
		System.out.println("===========");
		
		/*
		// ����������
		Espresso es = new Espresso();
		es.name();
		es.price();
		
		System.out.println("===========");
		
		// ī���
		CafeLatte ca = new CafeLatte();
		ca.name();
		ca.price();
		
		System.out.println("===========");
		
		// �ٴҶ��
		VanilaLatte va = new VanilaLatte();
		va.name();
		va.price();
		
		System.out.println("===========");
		
		// ����Ǫġ��
		Frappuccino fr = new Frappuccino();
		fr.name();
		fr.price();
		*/
	}
}
