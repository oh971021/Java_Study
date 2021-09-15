public class AMain_5 {
	public static void main(String[] args) {

		// 2차원 배열

		int[][] students = new int[][] { { 180, 80 }, { 150, 40 }, { 160, 50 }, { 170, 70 }, };

		// 첫번째 학생의 키
		System.out.println("첫번째 학생의 키 : " + students[0][0]);
		
		// 세번째 학생의 키
		System.out.println("세번째 학생의 키 : " + students[2][0]);
		
		// 두번째 학생의 키
		System.out.println("두번째 학생의 키 : " + students[1][0]);
		
		System.out.println("======================");
		
		// 2차원 배열 ( 이름과 사는 곳 )
		
		String[][] ss = {
				{"오준석", "대구"},
				{"노솔리", "부산"},
				{"이명재", "서울"},
		};
		
		// 두번째 사람 사는곳
		System.out.println(ss[1][1]);
		// 첫번째 사람 이름
		System.out.println(ss[0][0]);
		// 세번째 사람 이름과 사는곳
		System.out.println(ss[2][1]+" "+ss[2][0]);
		
		System.out.println("======================");
		
		// 1~12 까지 값을 넣어라
		
		int[][] ar = new int[3][4];
		int num = 0;
		for (int i = 0; i < 3; i++) { // 행
			System.out.printf("====%d행====\n", i);
			for (int j = 0; j < 4; j++) { // 열
				// 값 생성
				num++;
				// 생성된 값 대입시키기
				ar[i][j] += num; 
				// 결과 값 출력
				System.out.printf("ar[%d][%d] = %d\n", i, j, ar[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("===== 3x4배열 출력값 =====");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ar[i][j] + "\t" );
			}
			System.out.println();
		}
		
		System.out.println("========================");
		
		// 배열값 셋팅해서 변수에 집어넣어보기
		
		// 3차원 : [면][행][열]
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