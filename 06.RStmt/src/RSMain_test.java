import java.awt.event.ItemEvent;
import java.util.Scanner;

public class RSMain_test {
	public static void main(String[] args) {
		/*
		 *  1. ��ǰ��� / 2. ��ǰ�˻� / 3. ��ǰ���� / 4. ����
		 *	����ڰ� ��ȣ �Է� : 1 ~ 4
		 *	1�� �Է� : '����մϴ�'
		 *	2�� �Է� : '�˻��մϴ�' -> ǰ�� �Է¹ޱ�(ǰ�� : )
		 *	3�� �Է� : '�����մϴ�'
		 *	4�� �Է� : '���α׷� ����'
		 *	�� �� �Է� : '�Է� ����'
		 */
	
		Scanner k = new Scanner(System.in);
		
		while (true) {
			System.out.println("���� ��ȣ�� �Է����ּ��� (1:��� / 2:�˻� / 3:���� / 4:����) ");
			int num = k.nextInt();
			if (num == 1) {
				System.out.println("����մϴ�.");
			} else if (num == 2) {
				System.out.println("�˻��մϴ�.");
				System.out.print("ǰ�� : ");
				k.next();
			} else if (num == 3) {
				System.out.println("�����մϴ�.");
			} else if (num == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
}
