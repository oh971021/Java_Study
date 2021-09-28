import java.util.Scanner;

// �������̽��� ?
// ��ü�� ��ü�� �������ִ� �Ű�ü
// �������̽��� �߻�Ŭ������ ���� ���� ��ü ������ �Ұ����ϴ�.

// ������ (polymorphism)

interface Coffee2 {
	
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

class Espresso2 implements Coffee2 {
	@Override
	public void name() {
		System.out.println("����������");
	}

	@Override
	public void price() {
		System.out.println("2000��");
	}
}

class CafeLatte2 implements Coffee2 {
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
		Coffee2.super.HotorIced();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

class VanilaLatte2 implements Coffee2 {
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
		Coffee2.super.HotorIced();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

class Frappuccino2 implements Coffee2 {
	@Override
	public void name() {
		System.out.println("������ġ��");
	}

	@Override
	public void price() {
		System.out.println("5000��");
	}
}

public class OIMain_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hi;
		boolean run = true;
		// �ֿܼ� �ȳ����ּ���
		while (run) {
			// �ֹ� �Ͻðھ��?
			System.out.println("�ֹ� �Ͻðھ��?");
			// 1. ����������  2. ī���  3. �ٴҶ��  4. ����Ǫġ��
			System.out.println("1. ����������  2. ī���  3. �ٴҶ��  4. ����Ǫġ��  \n5. ���� �����..");
			int what = s.nextInt();
			// 5�� �Է½� �׳ɰ�����~
			switch (what) {
			case 1:
				Espresso2 es = new Espresso2();
				es.name();
				es.price();
				run = false;
				break;
			case 2:
				System.out.println("1. Hot  2. Iced");
				hi = s.nextInt();
				if (hi == 1) {
					System.out.println("������");
				} else if (hi == 2) {
					System.out.println("������");
				} else {
					System.out.println("�������������� ���̽��Դϴ�.");
					System.out.println("������");
				}
				CafeLatte2 ca = new CafeLatte2();
				ca.name();
				ca.price();
				run = false;
				break;
			case 3:
				System.out.println("1. Hot  2. Iced");
				hi = s.nextInt();
				if (hi == 1) {
					System.out.println("������");
				} else if (hi == 2) {
					System.out.println("������");
				} else {
					System.out.println("�������������� ���̽��Դϴ�.");
					System.out.println("������");
				}
				VanilaLatte2 va = new VanilaLatte2();
				va.name();
				va.price();
				run = false;
				break;
			case 4:
				Frappuccino2 fr = new Frappuccino2();
				fr.name();
				fr.price();
				run = false;
				break;
			case 5:
				System.out.println("�׳� ������~");
				run = false;
				break;	
			default:
				System.out.println("�޴��ǿ� ���׿�");
				break;
			}
		}
	}
}
