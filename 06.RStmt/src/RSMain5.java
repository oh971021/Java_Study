import java.util.Scanner;

public class RSMain5 {
	public static void main(String[] args) {
		
		// break : ���� ��ġ���� ���� ����� switch�� �Ǵ� for�� Ż��� ���
		// continue : ���� �ݺ��� �ǳʶٰ�, ���������� �Ѿ��. (���� �ݺ��� �����Ѵ�.)

//		for (int i = 1; i < 10+1; i++) {
//			// Ȧ�� �� ��,
//			if(i % 2 == 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		// Label : ����� ������ ������� ����.
		
		Scanner k = new Scanner(System.in);
		int ans = 0;
			
		aaa: for (int i = 0; i < 3; i++) {
			bbb: while (true) {
				System.out.println("������ ? ");
				ans = k.nextInt();
				
				switch (ans) {
				case 1:
					System.out.println("1�� (����)");
					break;
				case 2:
					System.out.println("2�� (����)");
					break;
				case 3:
					System.out.println("3�� (����)");
					break;
				case 4:
					System.out.println("4�� (����)");
//					break bbb; // while���� Ż�������� for���� �ɷ��� 3�� ����.
					break aaa; // for���� Ż��
				default:
					System.out.println("�Է¿���");
					break;
				}
			}
		}	
	}
}