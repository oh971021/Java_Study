import java.util.Random;

public class IAMain_3 {
	public static void main(String[] args) {
		
		// ���� ���ڸ� ���� (¦����)
		Random r = new Random();	// ���� ��ü ����
		int num = r.nextInt(5)+1;
		if(num % 2 == 0) {
			System.out.println(num);
		}
		
		System.out.println("=================");
		
		// ¦���� �������� �̾��ִ� �ڽ��� ����
		Box b = new Box();
		System.out.println(b.nextInt(3));
	}
}
