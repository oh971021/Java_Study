import java.util.Random;
import java.util.Scanner;

public class RSMain_test2 {
	public static void main(String[] args) {
		/*
		 * ���ھ߱�
		 * 
		 * ��ǻ�Ͱ� 0~3 ������ ���� ���� �̴´�.
		 * 
		 */
		
		Random r = new Random();	
		Scanner s = new Scanner(System.in);
		int com = r.nextInt(4);
		int myNum = 0;

		while (true) {
			com = r.nextInt(4);
			System.out.println(com); // ������ Ȯ�ο�
			System.out.println("���ڸ� �Է��ϼ���");
			myNum = s.nextInt();
			if (com == myNum) {
				break;
			}
		}
		System.out.println("�����Դϴ�");
		
		// 1. Ȧ¦ - �� ���� �ٽ�
		// 2. ���ٿ� - ����
		
	}
}