import java.util.Scanner;

public class AMain_3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 4ĭ ¥�� �ν��Ͻ� ����
		int[] val = new int[4];
		// ���� �׸� �����
		int sum = 0;
		// ������ ���� �Է�
		for (int i = 0; i < val.length; i++) {
			// �Է��� �ޱ����� ��ĳ�� ��� (�� 4�� ����)
			System.out.printf("%d�� ��ȣ �Է� : ", (i+1));
			val[i] = s.nextInt();
			// ���԰� �׸��� �־ ���ϱ�
//			sum += val[i];
		}
		// �� ���� �� �հ� ��� ( foreach ��� )
		// i ���� val ������ ������. 
		for (int i : val) {
			// �� ���� sum�� ���Խ�Ų��.
			sum += i;
		}
		
		// ���� ���
		System.out.println("���� : " + sum);
		
	}
}
