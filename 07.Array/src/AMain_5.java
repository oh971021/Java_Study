public class AMain_5 {
	public static void main(String[] args) {

		// 2���� �迭

		int[][] students = new int[][] { { 180, 80 }, { 150, 40 }, { 160, 50 }, { 170, 70 }, };

		// ù��° �л��� Ű
		System.out.println("ù��° �л��� Ű : " + students[0][0]);
		
		// ����° �л��� Ű
		System.out.println("����° �л��� Ű : " + students[2][0]);
		
		// �ι�° �л��� Ű
		System.out.println("�ι�° �л��� Ű : " + students[1][0]);
		
		System.out.println("======================");
		
		// 2���� �迭 ( �̸��� ��� �� )
		
		String[][] ss = {
				{"���ؼ�", "�뱸"},
				{"��ָ�", "�λ�"},
				{"�̸���", "����"},
		};
		
		// �ι�° ��� ��°�
		System.out.println(ss[1][1]);
		// ù��° ��� �̸�
		System.out.println(ss[0][0]);
		// ����° ��� �̸��� ��°�
		System.out.println(ss[2][1]+" "+ss[2][0]);
		
		System.out.println("======================");
		
		// 1~12 ���� ���� �־��
		
		int[][] ar = new int[3][4];
		int num = 0;
		for (int i = 0; i < 3; i++) { // ��
			System.out.printf("====%d��====\n", i);
			for (int j = 0; j < 4; j++) { // ��
				// �� ����
				num++;
				// ������ �� ���Խ�Ű��
				ar[i][j] += num; 
				// ��� �� ���
				System.out.printf("ar[%d][%d] = %d\n", i, j, ar[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("===== 3x4�迭 ��°� =====");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ar[i][j] + "\t" );
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		// �迭�� �����ؼ� ������ ����־��
		
		// 3���� : [��][��][��]
		int[][][] a = {
							{
								{1, 2, 3},
								{4, 5, 6},
								{7, 8, 9}
							},
							{
								{10, 11, 12},
								{13, 14, 15},
								{16, 17, 18}
							}
						};
							
	}
}