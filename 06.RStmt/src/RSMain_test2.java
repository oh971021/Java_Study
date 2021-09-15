import java.util.Random;
import java.util.Scanner;

public class RSMain_test2 {
	public static void main(String[] args) {
		/*
		 * 숫자야구
		 * 
		 * 컴퓨터가 0~3 사이의 랜덤 값을 뽑는다.
		 * 
		 */
		
		Random r = new Random();	
		Scanner s = new Scanner(System.in);
		int com = r.nextInt(4);
		int myNum = 0;

		while (true) {
			com = r.nextInt(4);
			System.out.println(com); // 개발자 확인용
			System.out.println("숫자를 입력하세요");
			myNum = s.nextInt();
			if (com == myNum) {
				break;
			}
		}
		System.out.println("정답입니다");
		
		// 1. 홀짝 - 턴 마다 다시
		// 2. 업다운 - 고정
		
	}
}