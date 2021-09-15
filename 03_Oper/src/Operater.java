import java.util.Scanner;

public class Operater {
	public static void main(String[] args) {
		
		// 단항 연산자
		// ! (not) : !A : A의 결과를 반대로
//		int x = 6, y = 10;
//		
//		// x가 5보다 크고, y가 10보다 작은가?
//		boolean b = x > 5 && y < 10;
//		System.out.println(b);
//	
//		// x가 5보다 크거나, y가 10보다 작나?
//		boolean c = x >5 || y < 10;
//		System.out.println(c);
//		
		
		// 놀이기구 입장제한
		
		// 키, 나이, 몸무게
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		int height = s.nextInt();
//
//		boolean ok = age >= 10 || !(height > 200);
//
//		if (ok == true) {
//			System.out.println("입장하세요");
//		} else {
//			System.out.println("입장불가합니다");
//		}

		// 삼항 연산자
		// 둘중 하나 (그거 아니면 이거)
		
		// 조건식 ? 만족시값(True) : 불만족시값(False)
		
		// 나이가 8살이 넘으면 Welcome, 넘지않으면 Go home
		String msg = age > 8 ? "Welcome" : "Go home";
		System.out.println(msg);
		
		// 키가 200이 넘거나 20이상이면 10000원, 아니면 5000원
		int ticket = height > 200 || age >= 20 ? 10000 : 5000;
		
		// 할인
		// 나이가 짝수면 1000원, 아니면 500원 할인
		int sale = (age % 2 == 0) ? 1000 : 500;
		
		// 총 요금
		// 입장료 - 할인금액
		int total = (ticket - sale);
		
		System.out.println("입장료 : " + ticket);
		System.out.println("할인 : " + sale);
		System.out.println("총 요금 : " + total);
		
		
		
	}
}
