import java.util.Scanner;

public class EMain_1 {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Exception Handling ( ����ó�� ) : ���ܻ�Ȳ�� ���å�� �������� ��.
		 
		 
		 1. ����(Error) : �ڹ� ������ ������ ���� �� �߻� (������ �Ұ���, ���α׷� �ϼ� �� ���� �Ұ���)
		 
		 2. ���(Warning) : �������� �� �߰ų� ������� �ʴ� ��� (�ڿ��� �����ϴ� ���) (������, ���α׷��� �����۵�)
		 
		 3. ����(Exception) : ������ �� �߻��ϴ� �������� ��Ȳ ������ ������� �ȵǴ� ��� (������, ���α׷��� �����۵�)
		 
		 */
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("X : ");
			int x = s.nextInt();
			System.out.print("Y : ");
			int y = s.nextInt();
			Thread.sleep(100);

			// �ϴ� Try �� �����ϰ�, ������ �߻��ϸ� catch�� �Ѿ��.
			try {
				System.out.println(x / y);
			} catch (Exception e) {
				System.out.println("0���� ���� �� �����ϴ�.");
				//			e.printStackTrace(); // ������ Ȯ�ο�
			}
		}	
	}
	
	public static void test() {
		int a = 1;
		int b = 0;
		try {
		int c = a / b;
		} catch (Exception e) {
			System.out.println("�����߻�");
		}
	}
	
}
