import java.util.Scanner;

public class EMain_2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("X : ");
		int x = s.nextInt();
		System.out.print("Y : ");
		int y = s.nextInt();

		// �ϴ� Try �� �����ϰ�, ������ �߻��ϸ� catch�� �Ѿ��.

		try {
			System.out.println(x / y);
			
			int[] ar = {10, 20};
			System.out.println("�迭�� ���? ");
			int i = s.nextInt();
			System.out.println(ar[i]);
			
			// �ش��ϴ� ���� ������ ���� catch ������ ����ؼ� ����ó���� ���ش�.
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace(); // ������ Ȯ�ο�
		}

//		try {
//			System.out.println(x / y);
//			
//			int[] ar = {10, 20};
//			System.out.println("�迭�� ���? ");
//			int i = s.nextInt();
//			System.out.println(ar[i]);
//			
//			// �ش��ϴ� ���� ������ ���� catch ������ ����ؼ� ����ó���� ���ش�.
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("0�̳� 1�� �Է� ���ּ���.");
//			// e.printStackTrace(); // ������ Ȯ�ο�
//		} catch (ArithmeticException e) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//			// e.printStackTrace();
//		}
		
	}


	public static void test() throws ArrayIndexOutOfBoundsException {
		int aa[] = {1};
		System.out.println(aa[3]);
	}
	

	public static void test2() {
		int aa[] = {1};
		try {
			System.out.println(aa[3]);
		} catch (Exception e) {
			System.out.println("���� �߻�");
		}
	}
	
}
