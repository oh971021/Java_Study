import java.nio.channels.ClosedByInterruptException;
import java.util.Scanner;

import org.w3c.dom.Text;

import jdk.internal.agent.resources.agent;

public class FMain_2 {
	// ������ ������ ������ ���ؼ� '���' ���ִ� �Լ�
	// ���� * 12
	
	public static void getSalary(int month) {
		System.out.println("���� : " + (month * 12));
	}
	
	public static int getSalary2(int month) {
		int salary = (month * 12);
		return salary;
	}
	
	// ��ǰ������ ������ �ΰ����� ���ؼ� ������ִ� �Լ�
	public static void VAT(int price) {
		System.out.println("�ΰ��� : " + price * 0.08);
	}
	
	// ��ǰ������ ������ �ΰ����� �����ִ� �Լ�
	public static double VAT2(int price) {
		return (price * 0.08);
	}
	
	public static void main(String[] args) {
		getSalary(100);
		System.out.println("-----------");
		int Salary = getSalary2(200);
		System.out.println("���� : " + Salary);
		System.out.println("-----------");
		
		int price = 1500;
		System.out.println("��ǰ���� : " + price);
		VAT(price);
		System.out.println("�ΰ��� : " + VAT2(price));
		System.out.println("-----------");
		
		// �Է¹��� �غ�
		Scanner s = new Scanner(System.in);
		
		System.out.print("�߰� ������ �Է����ּ��� : ");
		int score_J = s.nextInt();
		System.out.print("�⸻ ������ �Է����ּ��� : ");
		int score_G = s.nextInt();
		
		double Score = Avg(score_J, score_G);
		System.out.println("��� �� : " + Score);
		System.out.println("-----------");
		
		System.out.print("���̸� �Է����ּ��� : ");
		int age = s.nextInt();
		Hello(age);
		System.out.println("-----------");
		s.close();
	}
	
	// Test
	// 1. �߰�, �⸻ ������ ������ ����� �����ִ� �Լ� (scan ���)
	public static double Avg(int J, int G) {
		return ((J + G) / 2);
	}
	
	
	// 2. ���̸� ������ �λ縻�� ������ִ� �Լ� (scan ���)
	public static void Hello(int age) {
		if (9 < age && age < 20) {
			System.out.println("�ȳ�");
		} else if (19 < age && age < 30) {
			System.out.println("�ȳ��ϼ���");
		} else if (30 <= age) {
			System.out.println("�ȳ��Ͻʴϱ�");
		} else {
			System.out.println("���ư��� ����ģ��");
		}
	}
	
	// 3. ���� �� ���� ������ �� ū ���ڸ� �����ִ� �Լ�
		// 10, 20
	public static int Bigger(int a, int b) {
//		if (a > b) {
//			return a;
//		} else {
//			return b;
//		}
		
		return (a < b) ? b : a;
	}
}
