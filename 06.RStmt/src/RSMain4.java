import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class RSMain4 {
	public static void main(String[] args) {

		/*
		// 1+2+3 ... +10 = 55
		int count = 0;
		
		for (int i=1; i<10+1; i++) {
			count += i;
		}
		System.out.println(count);
		*/
		
		// for (�ݺ�Ƚ��)
		// while (�ݺ�����)
		
		// 1+2+3... ����� ���ؾ� 1000�� �ѳ���?
		
//		int count = 0;
//		int i = 1;
		
		// ���� ����� ���ؾ� 10�� �ѳ�?
		
//		while (count < 10) {
//			count += i;
//			i++;
//		}
//		System.out.println(count);
//		System.out.println(i-1);

		// ����� ���ؾ� 50�� �ѳ���?
		
//		while (count < 50) {
//			count += i;
//			i++;
//		}
//		System.out.println(count);
//		System.out.println(i-1); // �ϳ��� ������ ���·� �������ͼ� -1�� �������.
		
		// ����� ���ؾ� 1000�� �ѳ���?
		
//		while (count < 1000) {
//			count += i;
//			i++; // �������� ������ ++ �ؼ� ������ش�.
//		}
//		System.out.println(count);
//		System.out.println(i-1);
		
		// ��ĳ�� �̿��ؼ� ���ϴ� ���� ���ϱ�
		
		Scanner k = new Scanner(System.in);
		
		// �Է� - 0�� ������ stop �ǰ� �����.
		
		int c = 1;
		
//		while (c != 0) {
//			System.out.println("f : ");
//			c = k.nextInt();
//		}
		
//		while (true) {
//			System.out.println("c : ");
//			c = k.nextInt();
//			if (c == 0) {
//				break;
//			}
//		}

//		int aaa = 0;
//		
//		while (true) {
//			System.out.println(aaa);
//			if (aaa == 10) {
//				break;
//			}
//			aaa++;
//		}
		
		// do - while ��
		// ���� ���ο� ������� �ѹ��� ������ ���� ����
		
		int kk = 0;
		int ll = 0;
		
		do {
			kk += 2;
			ll++;
		} while (kk < -100);
		
		System.out.println(kk);
		System.out.println(ll);
	}
}
