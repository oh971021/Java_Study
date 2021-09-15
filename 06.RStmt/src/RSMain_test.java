import java.awt.event.ItemEvent;
import java.util.Scanner;

public class RSMain_test {
	public static void main(String[] args) {
		/*
		 *  1. 상품등록 / 2. 상품검색 / 3. 상품삭제 / 4. 종료
		 *	사용자가 번호 입력 : 1 ~ 4
		 *	1번 입력 : '등록합니다'
		 *	2번 입력 : '검색합니다' -> 품명 입력받기(품명 : )
		 *	3번 입력 : '삭제합니다'
		 *	4번 입력 : '프로그램 종료'
		 *	그 외 입력 : '입력 오류'
		 */
	
		Scanner k = new Scanner(System.in);
		
		while (true) {
			System.out.println("서비스 번호를 입력해주세요 (1:등록 / 2:검색 / 3:삭제 / 4:종료) ");
			int num = k.nextInt();
			if (num == 1) {
				System.out.println("등록합니다.");
			} else if (num == 2) {
				System.out.println("검색합니다.");
				System.out.print("품명 : ");
				k.next();
			} else if (num == 3) {
				System.out.println("삭제합니다.");
			} else if (num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}
