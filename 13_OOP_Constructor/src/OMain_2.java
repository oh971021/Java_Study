import java.util.Scanner;

public class OMain_2 {
	// 프로그래머 생성
	
	// 이름 : String
	// 나이 : int
	// 야근 : boolean
	
	// p1.work()      // 무응답
	// p1.work("일") // 코딩하기
	// p1.work("퇴근") // 감사요

	public static void main(String[] args) {
		Programer p1 = new Programer("오준석", 25, true);
		
		Scanner s = new Scanner(System.in);
		
		String what = s.nextLine();
		
		p1.work();
		p1.work(what);
	}
}
