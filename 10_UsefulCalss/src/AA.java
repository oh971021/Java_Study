import java.util.Scanner;

public class AA {
	//������ ������ ������ ���ؼ� '���'���ִ� �Լ�
	//����*12
	public static void getSalary(int month) {
		System.out.println("����: " + (month * 12));
	}
	
	// ������ ������ ������ �����ִ� �Լ�
	public static int getSalary2(int month) {
		int salary = month * 12;
		return salary;
	}
	
	// ��ǰ������ ������ �ΰ����� �����ִ� �Լ�
	public static void vat(int price) {
		System.out.println(price-(int)(price*0.08));
	}
	// ��ǰ������ ������ �ΰ����� '���'���ִ� �Լ�
	public static int vat2(int price) {
		int vat = (int) (price-(price*0.08));
		return vat;
	}
	//Test (�ٸ� �޼��� ���� ��������)
	//1. �߰�, �⸻ ������ ������ ����� �����ִ� �Լ� (scanner�� �߰��⸻ �Է¹ޱ�)
	public static void test(int score1, int score2) {
		System.out.println("����� ��������� : " + (score1+score2)/2);
	}
	//2. ���̸� ������ �λ縻�� ������ִ� �Լ�(scanner�� �Է¹ޱ�)
	public static void hi(int age) {
		if(age > 9 && age <20) {
			System.out.println("�ȳ�");
		}else if(age > 20 && age <30) {
			System.out.println("�ȳ��ϼ���");
		}else {
			System.out.println("�ȳ��Ͻʴϱ�");
		}
	}
	//10�� : �ȳ�
	//20�� : �ȳ��ϼ���
	//�� �̻� : �ȳ��Ͻʴϱ�
	
	// ���� 2���� ������ ��ū ���ڸ� �����ִ� �Լ�
	public static int getBigger(int a, int b) {
//		if(a>b) {
//			return a;
//		}
//			return b;
		return(a < b)? b :a ;
	}
	
	
	public static void main(String[] args) {
//		getSalary(100);
//		System.out.println("--------------------------");
//		System.out.println(getSalary2(200));
//		System.out.println("--------------------------");
		
		vat(5000);
		System.out.println(vat2(5000));
		
		System.out.println("--------------------------");
		System.out.println("�⸻���� �߰���� ������ �Է��ϼ���>>>");
		Scanner s = new Scanner(System.in);
		int score1 = s.nextInt();
		int score2 = s.nextInt();	
		test(score1, score2);
		
		System.out.println("--------------------------");
		System.out.println("���̸� �Է��ϼ���>>>");
		int age = s.nextInt();
		hi(age);
		System.out.println("--------------------------");
		System.out.println(getBigger(30, 10));

	}
}
