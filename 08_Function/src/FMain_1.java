import java.util.Scanner;

/*
		 * �Լ� : ����� ��Ƴ��� �ڽ� ���� ��. �ʿ��� �� �ҷ��ͼ� ����Ѵ�.
		  
		 1. �Լ� ���� 
		 public static void �Լ���() {
		 		����
		 }
		 
		 1-1. �Լ��� ����(argument), �Ű�����(parameter) : �Լ� ���࿡ �ʿ��� �͵�
		 public static void �Լ���(�ڷ��� ������, �ڷ��� ������, ...(parameter) ) {
		 		����
		 }
		 
		 2. �Լ� ȣ�� : �Լ���(argument); // �Լ��� ���� ���ڸ� ���ְ�, �Լ��� �� ���ڸ� �Ű������� �޴´�. 
		 */

public class FMain_1 {
	public static void Info(String a, int b) {
		System.out.printf("�̸� : %s\n ", a);
		System.out.printf("���� : %d\n", b);
	}

	public static void Push(int cnt) {
		System.out.println("�����");
		System.out.println("=====");
		for (int i = 0; i < cnt; i++) {
			System.out.println("�� ����");
			System.out.println("�� ��");
		}
	}
	
	public static void Move(String a) {
		System.out.println("â�� ���� �� ì���");
		Ball(a);
	}
	
	public static void Ball(String a) {
		if (a.equals("��")) {
			System.out.println("�󱸰� ������ ���� ��");
		} else if (a.equals("�౸")) {
			System.out.println("�౸�� ������ ��� ����");
		} else {
			System.out.println("�׷� �� �����ϴ�");
		}
		System.out.println("���� ���ڸ���");
	}
	
	// void : return(���)�� ���� ��
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	
	// void�� �ڷ������� �����ϸ� return���� �����ȴ�.
	public static int add2(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Info("�ؼ�", 25);
		System.out.println("=======");
		Push(1);
		
		System.out.println("=======");
		
		// test
		// �� or �౸ �Է¿� ���� �ٸ� ó��.
			// sca (x) arg�� ���� ����
		
		// â�� ���� (��������)
		// �󱸰� ������ ���� ��
		Move("��");
		
		// �౸�� ������ ��� ��
//		Move("�౸");
		// ü���ð� ������ ���� ���ڸ���
		
		System.out.println("=======");
		add(1, 2);
		System.out.println(add2(1, 2));
	}
}
