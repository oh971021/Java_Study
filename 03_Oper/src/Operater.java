import java.util.Scanner;

public class Operater {
	public static void main(String[] args) {
		
		// ���� ������
		// ! (not) : !A : A�� ����� �ݴ��
//		int x = 6, y = 10;
//		
//		// x�� 5���� ũ��, y�� 10���� ������?
//		boolean b = x > 5 && y < 10;
//		System.out.println(b);
//	
//		// x�� 5���� ũ�ų�, y�� 10���� �۳�?
//		boolean c = x >5 || y < 10;
//		System.out.println(c);
//		
		
		// ���̱ⱸ ��������
		
		// Ű, ����, ������
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = s.nextInt();
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		int height = s.nextInt();
//
//		boolean ok = age >= 10 || !(height > 200);
//
//		if (ok == true) {
//			System.out.println("�����ϼ���");
//		} else {
//			System.out.println("����Ұ��մϴ�");
//		}

		// ���� ������
		// ���� �ϳ� (�װ� �ƴϸ� �̰�)
		
		// ���ǽ� ? �����ð�(True) : �Ҹ����ð�(False)
		
		// ���̰� 8���� ������ Welcome, ���������� Go home
		String msg = age > 8 ? "Welcome" : "Go home";
		System.out.println(msg);
		
		// Ű�� 200�� �Ѱų� 20�̻��̸� 10000��, �ƴϸ� 5000��
		int ticket = height > 200 || age >= 20 ? 10000 : 5000;
		
		// ����
		// ���̰� ¦���� 1000��, �ƴϸ� 500�� ����
		int sale = (age % 2 == 0) ? 1000 : 500;
		
		// �� ���
		// ����� - ���αݾ�
		int total = (ticket - sale);
		
		System.out.println("����� : " + ticket);
		System.out.println("���� : " + sale);
		System.out.println("�� ��� : " + total);
		
		
		
	}
}
