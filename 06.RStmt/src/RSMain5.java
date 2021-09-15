import java.util.Scanner;

public class RSMain5 {
	public static void main(String[] args) {
		
		// break : 현재 위치에서 가장 가까운 switch문 또는 for문 탈출시 사용
		// continue : 현재 반복을 건너뛰고, 증감식으로 넘어간다. (다음 반복을 진행한다.)

//		for (int i = 1; i < 10+1; i++) {
//			// 홀수 일 때,
//			if(i % 2 == 0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		// Label : 기능이 좋으나 사용하지 않음.
		
		Scanner k = new Scanner(System.in);
		int ans = 0;
			
		aaa: for (int i = 0; i < 3; i++) {
			bbb: while (true) {
				System.out.println("정답은 ? ");
				ans = k.nextInt();
				
				switch (ans) {
				case 1:
					System.out.println("1번 (오답)");
					break;
				case 2:
					System.out.println("2번 (오답)");
					break;
				case 3:
					System.out.println("3번 (오답)");
					break;
				case 4:
					System.out.println("4번 (정답)");
//					break bbb; // while문을 탈출하지만 for문에 걸려서 3번 돌림.
					break aaa; // for문을 탈출
				default:
					System.out.println("입력오류");
					break;
				}
			}
		}	
	}
}