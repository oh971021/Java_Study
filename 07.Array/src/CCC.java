import java.util.Random;
import java.util.Scanner;

public class CCC {
	public static void main(String[] args) {
		// 참참참
		
		// 숫자뽑고, 숫자 고를 수 있게 생성
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		boolean value = true;
		int count = 0;
		
		// 진행방향 ( 메뉴선정 )
		String[] table = {"", "왼쪽", "오른쪽", "위", "아래", "가만히"};
		
		while (value) {

			// 진행방향 물어보기 ( 메뉴판 )
			System.out.println("============================================");
			System.out.println("1. 왼쪽 / 2. 오른쪽 / 3. 위 / 4. 아래 / 5. 가만히");
			System.out.println("============================================");

			// 컴퓨터의 진행방향 뽑기 ( 1 ~ 5의 숫자를 뽑는 컴퓨터 손가락 )
			int comFace = r.nextInt(5) + 1;
			// System.out.println(comFace); // 개발자 테스트용

			// 진행방향 입력받기 ( 메뉴고르기 )
			System.out.println("진행방향을 고르시오. : (숫자입력)");
			int myFace = k.nextInt();

			// 사용자의 쓸데없는 짓 방지 ( 예외처리 )
			if (myFace < 1 || myFace > 5) {
				System.out.println("입력 오류");
				continue;
			}
			
			// 서로의 진행방향 확인하기 
			System.out.printf("나 : %s\n", table[myFace]);
			System.out.printf("컴 : %s\n", table[comFace]);

			// 판정 ( 같으면 패배 / 다르면 승리 )
			if (myFace == comFace) {
				System.out.println("걸림");
				System.out.println((count+1) + "번의 게임을 했다.");
				break;
			} else {
				System.out.println("피함");
				count++;
			}

		}
	}
}
