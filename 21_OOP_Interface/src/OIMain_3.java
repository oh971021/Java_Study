import java.util.Scanner;

// �������̽��� ?
// ��ü�� ��ü�� �������ִ� �Ű�ü
// �������̽��� �߻�Ŭ������ ���� ���� ��ü ������ �Ұ����ϴ�.

// ������ (polymorphism)

interface Coffee3 {
	
	// interface �� �Ϲ� �޼ҵ带 ����� �� ���
	// �޼ҵ带 �����ϸ� abs-�� �����Ǿ �߻� �޼ҵ�� ���ǵȴ�.
	abstract void name();
	void price();
	
	// �߻� Ŭ�������� ���� �޼ҵ带 �����ϴ� ���
	// default �޼ҵ带 ����Ѵ�.
	default void HotorIced() {
		// ���� ������ �ʿ��� ���׸� default �޼ҵ带 ����Ѵ�.
		System.out.println("1. Hot?  2. Iced?");
	}; 
	
	default void choice(int a) {
		if (a == 1) {
			System.out.print("������ ");
		} else if (a == 2) {
			System.out.print("������ ");
		} else {
			System.out.println("�������������� ���̽��Դϴ�.");
			System.out.print("������ ");
		}
	}
}

class Espresso3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("����������");
	}

	@Override
	public void price() {
		System.out.println("2000��");
	}
}

class CafeLatte3 implements Coffee3 {
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
		Coffee3.super.HotorIced();
	}
	@Override
	public void choice(int a) {
		Coffee3.super.choice(a);
	}
}

class VanilaLatte3 implements Coffee3 {
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
		Coffee3.super.HotorIced();
	}
	@Override
	public void choice(int a) {
		Coffee3.super.choice(a);
	}
}

class Frappuccino3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("������ġ��");
	}

	@Override
	public void price() {
		System.out.println("5000��");
	}
}

public class OIMain_3 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hi; 	// ��, ���̽� ������ �� �޴� ����
		// �ֿܼ� �ȳ����ּ���
		while (true) {
			// �ֹ� �Ͻðھ��?
			System.out.println("�ֹ� �Ͻðھ��?");
			
			// 1. ����������  2. ī���  3. �ٴҶ��  4. ����Ǫġ��
			System.out.println("1. ����������  2. ī���  3. �ٴҶ��  4. ����Ǫġ��  5. ���� �����..");
			
			// �޴� ���� ( what )
			int what = s.nextInt();
			
			// �׸� �����
			Coffee3 coffee = null;
	
			if (what == 1) {
				coffee = new Espresso3();

			} else if (what == 2) {
				coffee = new CafeLatte3();

			} else if (what == 3) {
				coffee = new VanilaLatte3();

			} else if (what == 4) {
				coffee = new Frappuccino3();
				
			} else if (what == 5) {
				System.out.println("�׳� ������~");
				break;
				
			} else {
				System.out.println("�޴��ǿ� �����ϴ�.");
				continue;
			}
			
			if (what == 2 || what ==3) {
				coffee.HotorIced();
				// �����Ѱ�, ������� �Է¹ޱ�
				hi = s.nextInt();
				// ���û��׿� ���� ���
				if (hi == 1) {
					System.out.println("������");
				} else if (hi == 2) {
					System.out.println("������");
				} else {
					System.out.println("�������������� ���̽��Դϴ�.");
					System.out.println("������");
				}
			} 
			coffee.name();
			coffee.price();
		}	
	}
}
