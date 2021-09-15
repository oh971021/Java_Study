import java.util.Random;
import java.util.Scanner;

public class NGame {
	public static void main(String[] args) {
		// Number Game (Up Down)

		Scanner k = new Scanner(System.in);
		Random r = new Random();

		// 랜덤 숫자 뽑기
		int comNum = r.nextInt(99) + 1;	// 3개 중에 랜덤 (+1은 1부터 시작)
		System.out.println(comNum);	// 컴퓨터가 뽑은 랜덤숫자 (개발자 확인용)
		
		// 언제 끝 ?
		// 맞추면 끝나면서 정답을 외치고, 몇번 시도를 했는지
		int count = 0;

		while (true) {
			// 사용자가 대답
			System.out.print("Num : ");
			int myNum = k.nextInt();
			count++;
			
			// 판정
			// 결과에 따라  '정답', '업', '다운'  안내
			if (myNum <= 100 && myNum > 0) {
				if (comNum == myNum) {
					System.out.printf("%d번만에 정답", count);
					break;
				} else if(comNum < myNum) {
					System.out.println("Down");
				} else {
					System.out.println("Up");
				} 
			} else {
				System.out.println("1~ 100안의 숫자를 적어주세요");
				count--;
			}
		}
	}
}
