import java.util.Scanner;

public class Introduce {
	public static void main(String[] args) {
		// �ڱ�Ұ�
		
		// �ֿܼ� ������ ����Ͻÿ�
		// �̸� : ����
		// ���� : ����
		// ��� �� : ����
		Scanner s = new Scanner(System.in);
	
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = s.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = s.nextInt();
		
		System.out.println();
		
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %d\n", age);
		
		if (name != " ") {
			System.out.printf("��� �� : %s\n", "�뱸");	
		} 
	}
}
