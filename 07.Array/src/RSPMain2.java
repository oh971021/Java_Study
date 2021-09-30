import java.util.Random;
import java.util.Scanner;

import com.sun.java.swing.plaf.windows.resources.windows;

public class RSPMain2 {
	public static void main(String[] args) {
		
		// 가위바위보
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		String hand[] = {"", "묵", "찌", "빠", "런"};
		
		int count = 0; // 몇판?
		int draw = 0; // 무승부 횟수 체크
		int lose = 0; // 패배 횟수 체크
		int win = 0; // 승리 횟수 체크
		int winmax = 0;
		int max = 0;
		
		boolean loop = true; // 조건에 따라 탈출 
		
		System.out.println("======== Game Start ========");
		
		while (loop) {
			
			// 5점을 얻으면 승리! 
			// 5점을 잃으면 패배!
			if (win == 5 || lose == 5) {
				break;
			}
			
			// 연승처리
			if (winmax > max) {
				max = winmax;
			}
			
			if (winmax == 2) {
				System.out.println("2연승 중 입니다. 화이팅!");
			} else if (winmax == 3) {
				System.out.println("3연승 중 입니다. 화이팅!");
			} else if (winmax == 4) {
				System.out.println("4연승 중 입니다. 제법이군요");
			} 
			
			// 안내판
			System.out.println("============================");
			System.out.println("1. 찌 / 2. 묵 / 3. 빠 / 4. 런");
			System.out.println("============================");
			
			// 컴퓨터 숫자 뽑기
			int comHand = r.nextInt(3)+1;
			System.out.println("개발자 확인용 : " + comHand);
			
			// 물어보기, 내 숫자 뽑기
			System.out.print("무엇을 내시겠습니까? : 숫자입력 > ");
			int myHand = k.nextInt();
			
			// 사용자의 헛짓방지 ( 예외처리 )
			if (myHand < 1 || myHand > 4) {
				System.out.println("입력 오류");
				count--;
				continue;
			} else if (myHand == 4) {
				System.out.println("도망 가시는 건가요?");
				count--;
				break;
			}
			
			// 서로 뭐 낸지 확인하기
			System.out.println("(나) " + hand[myHand] + " : " + hand[comHand] + " (컴)");
			System.out.print("결과 : ");
			
			int result = myHand - comHand;
			// -1, 2	패
			// -2, 1	승
			// =========== 알고리즘 ===========
			// 규칙, 연산을 발견해서 빠르게 결과값을 추출해 내는 것
			
			if (myHand == comHand) {
				System.out.println("무승부");
				count++;
				draw++;
				continue;
			// 숫자라서 연산처리로 결과값을 만들 수 있음
			} else if (result == -1 || result == 2) {
				System.out.println("패배");
				winmax = 0;
				count++;
				lose++;
				continue;
			} else {
				System.out.println("승리");
				win++;
				winmax++;
				continue;
			}
		}
		
		// 몇판했는지, 최종 Total 말해주기
		System.out.println((count+1) +"번의 게임을 진행했습니다.");
		System.out.printf("========= %d승 %d무 %d패 ========\n", win, draw, lose);
		System.out.println("최대 " + max + "연승");
		System.out.println("========= Game Over ========");
	}
}
