import java.util.Random;
import java.util.Scanner;

public class CCC {
	public static void main(String[] args) {
		// ������
		
		// ���ڻ̰�, ���� �� �� �ְ� ����
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		boolean value = true;
		int count = 0;
		
		// ������� ( �޴����� )
		String[] table = {"", "����", "������", "��", "�Ʒ�", "������"};
		
		while (value) {

			// ������� ����� ( �޴��� )
			System.out.println("============================================");
			System.out.println("1. ���� / 2. ������ / 3. �� / 4. �Ʒ� / 5. ������");
			System.out.println("============================================");

			// ��ǻ���� ������� �̱� ( 1 ~ 5�� ���ڸ� �̴� ��ǻ�� �հ��� )
			int comFace = r.nextInt(5) + 1;
			// System.out.println(comFace); // ������ �׽�Ʈ��

			// ������� �Է¹ޱ� ( �޴����� )
			System.out.println("��������� ���ÿ�. : (�����Է�)");
			int myFace = k.nextInt();

			// ������� �������� �� ���� ( ����ó�� )
			if (myFace < 1 || myFace > 5) {
				System.out.println("�Է� ����");
				continue;
			}
			
			// ������ ������� Ȯ���ϱ� 
			System.out.printf("�� : %s\n", table[myFace]);
			System.out.printf("�� : %s\n", table[comFace]);

			// ���� ( ������ �й� / �ٸ��� �¸� )
			if (myFace == comFace) {
				System.out.println("�ɸ�");
				System.out.println((count+1) + "���� ������ �ߴ�.");
				break;
			} else {
				System.out.println("����");
				count++;
			}

		}
	}
}
