import java.util.Random;
import java.util.Scanner;

public class NGame {
	public static void main(String[] args) {
		// Number Game (Up Down)

		Scanner k = new Scanner(System.in);
		Random r = new Random();

		// ���� ���� �̱�
		int comNum = r.nextInt(99) + 1;	// 3�� �߿� ���� (+1�� 1���� ����)
		System.out.println(comNum);	// ��ǻ�Ͱ� ���� �������� (������ Ȯ�ο�)
		
		// ���� �� ?
		// ���߸� �����鼭 ������ ��ġ��, ��� �õ��� �ߴ���
		int count = 0;

		while (true) {
			// ����ڰ� ���
			System.out.print("Num : ");
			int myNum = k.nextInt();
			count++;
			
			// ����
			// ����� ����  '����', '��', '�ٿ�'  �ȳ�
			if (myNum <= 100 && myNum > 0) {
				if (comNum == myNum) {
					System.out.printf("%d������ ����", count);
					break;
				} else if(comNum < myNum) {
					System.out.println("Down");
				} else {
					System.out.println("Up");
				} 
			} else {
				System.out.println("1~ 100���� ���ڸ� �����ּ���");
				count--;
			}
		}
	}
}
