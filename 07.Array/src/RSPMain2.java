import java.util.Random;
import java.util.Scanner;

import com.sun.java.swing.plaf.windows.resources.windows;

public class RSPMain2 {
	public static void main(String[] args) {
		
		// ����������
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		String hand[] = {"", "��", "��", "��", "��"};
		
		int count = 0; // ����?
		int draw = 0; // ���º� Ƚ�� üũ
		int lose = 0; // �й� Ƚ�� üũ
		int win = 0; // �¸� Ƚ�� üũ
		int winmax = 0;
		int max = 0;
		
		boolean loop = true; // ���ǿ� ���� Ż�� 
		
		System.out.println("======== Game Start ========");
		
		while (loop) {
			
			// 5���� ������ �¸�! 
			// 5���� ������ �й�!
			if (win == 5 || lose == 5) {
				break;
			}
			
			// ����ó��
			if (winmax > max) {
				max = winmax;
			}
			
			if (winmax == 2) {
				System.out.println("2���� �� �Դϴ�. ȭ����!");
			} else if (winmax == 3) {
				System.out.println("3���� �� �Դϴ�. ȭ����!");
			} else if (winmax == 4) {
				System.out.println("4���� �� �Դϴ�. �����̱���");
			} 
			
			// �ȳ���
			System.out.println("============================");
			System.out.println("1. �� / 2. �� / 3. �� / 4. ��");
			System.out.println("============================");
			
			// ��ǻ�� ���� �̱�
			int comHand = r.nextInt(3)+1;
			System.out.println("������ Ȯ�ο� : " + comHand);
			
			// �����, �� ���� �̱�
			System.out.print("������ ���ðڽ��ϱ�? : �����Է� > ");
			int myHand = k.nextInt();
			
			// ������� �������� ( ����ó�� )
			if (myHand < 1 || myHand > 4) {
				System.out.println("�Է� ����");
				count--;
				continue;
			} else if (myHand == 4) {
				System.out.println("���� ���ô� �ǰ���?");
				count--;
				break;
			}
			
			// ���� �� ���� Ȯ���ϱ�
			System.out.println("(��) " + hand[myHand] + " : " + hand[comHand] + " (��)");
			System.out.print("��� : ");
			
			int result = myHand - comHand;
			// -1, 2	��
			// -2, 1	��
			// =========== �˰��� ===========
			// ��Ģ, ������ �߰��ؼ� ������ ������� ������ ���� ��
			
			if (myHand == comHand) {
				System.out.println("���º�");
				count++;
				draw++;
				continue;
			// ���ڶ� ����ó���� ������� ���� �� ����
			} else if (result == -1 || result == 2) {
				System.out.println("�й�");
				winmax = 0;
				count++;
				lose++;
				continue;
			} else {
				System.out.println("�¸�");
				win++;
				winmax++;
				continue;
			}
		}
		
		// �����ߴ���, ���� Total �����ֱ�
		System.out.println((count+1) +"���� ������ �����߽��ϴ�.");
		System.out.printf("========= %d�� %d�� %d�� ========\n", win, draw, lose);
		System.out.println("�ִ� " + max + "����");
		System.out.println("========= Game Over ========");
	}
}
