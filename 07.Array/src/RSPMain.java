import java.util.Random;
import java.util.Scanner;

public class RSPMain {
	public static void main(String[] args) {
		
		// ����������
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		String hand[] = {"", "��", "��", "��", "��"};
		
		int count = 0; // ����?
		int draw = 0; // ���º� Ƚ�� üũ
		int lose = 0; // �й� Ƚ�� üũ
		int win = 0; // �¸� Ƚ�� üũ
		
		boolean loop = true; // ���ǿ� ���� Ż�� 
		
		System.out.println("======== Game Start ========");
		
		while (loop) {
			
			// 5���� ������ �¸�! 
			// 5���� ������ �й�!
			if (win == 5 || lose == 5) {
				break;
			}
			
			// ���� ó��
			if (win == 2) {
				System.out.println("2���� �� �Դϴ�. ȭ����!");
			} else if (win == 3) {
				System.out.println("3���� �� �Դϴ�. ȭ����!");
			} else if (win == 4) {
				System.out.println("4���� �� �Դϴ�. �����̱���");
			} 
			
			// �ȳ���
			System.out.println("============================");
			System.out.println("1. �� / 2. �� / 3. �� / 4. ��");
			System.out.println("============================");
			
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
			
			// ��ǻ�� ���� �̱�
			int comHand = r.nextInt(3)+1;
			// System.out.println("������ Ȯ�ο� : " + comHand);
			
			// ���� �� ���� Ȯ���ϱ�
			System.out.println("(��) " + hand[myHand] + " : " + hand[comHand] + " (��)");
			System.out.print("��� : ");
			
			// ����1 : ���� ������ ���� ��, 3������ ���� (��, ��, ��)
			// ����1-1 : ���ºδ� �����ϱ� ��ġ��
			if (myHand == comHand) {
				System.out.println("���º�");
				count++;
				draw++;
				continue;
			}
			// ����2 : ��ǻ���� ���� ���� ��, �� ������ 
			if (myHand == 1) {
				switch (comHand) {
				case 2: // (�� : ��)
					System.out.println("�¸�");
					win++;
					continue;
				case 3: // (�� : ��)
					System.out.println("�й�");
					count++;
					lose++;
					continue;
				}
			} else if (myHand == 2) {
				switch (comHand) {
				case 1: // (�� : ��)
					System.out.println("�й�");
					count++;
					lose++;
					continue;
				case 3: // (�� : ��)
					System.out.println("�¸�");
					count++;
					win++;
					continue;
				}
			} else if (myHand == 3) {
				switch (comHand) {
				case 1: // (�� : ��)
					System.out.println("�¸�");
					win++;
					continue;
				case 2: // (�� : ��)
					System.out.println("�й�");
					count++;
					lose++;
					continue;
				}
			}
		}
		
		// �����ߴ���, ���� Total �����ֱ�
		System.out.println((count+1) +"���� ������ �����߽��ϴ�.");
		System.out.printf("========= %d�� %d�� %d�� ========\n", win, draw, lose);
		System.out.println("========= Game Over ========");
	}
}
