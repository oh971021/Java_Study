public class RS_Practice {
	public static void main(String[] args) {
	
		// 1. 2�� for�� ��� : ������	( ���� )	
		
//		for (int i = 2; i < 9+1; i++) {
//			System.out.printf("%d��\n", i);
//			for (int j = 0; j < 9+1; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i*j);
//			}
//		}
		
		// 2. 2�� for�� ��� : ������ ( ���� )
		
		for (int i = 1; i < 9+1; i++) {
			for (int j = 2; j < 9+1; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i*j);
			}
			System.out.println();
		}
		
	}
}
