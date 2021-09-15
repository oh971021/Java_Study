import java.util.Scanner;

public class EMain_1 {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Exception Handling ( 예외처리 ) : 예외상황의 대비책을 세워놓는 것.
		 
		 
		 1. 에러(Error) : 자바 문법의 문제가 있을 때 발생 (컴파일 불가능, 프로그램 완성 및 실행 불가능)
		 
		 2. 경고(Warning) : 뒷정리를 덜 했거나 사용하지 않는 경우 (자원을 낭비하는 경우) (컴파일, 프로그램은 정상작동)
		 
		 3. 예외(Exception) : 실행할 때 발생하는 예외적인 상황 때문에 디버깅이 안되는 경우 (컴파일, 프로그램은 정상작동)
		 
		 */
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("X : ");
			int x = s.nextInt();
			System.out.print("Y : ");
			int y = s.nextInt();
			Thread.sleep(100);

			// 일단 Try 를 실행하고, 문제가 발생하면 catch로 넘어간다.
			try {
				System.out.println(x / y);
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다.");
				//			e.printStackTrace(); // 개발자 확인용
			}
		}	
	}
	
	public static void test() {
		int a = 1;
		int b = 0;
		try {
		int c = a / b;
		} catch (Exception e) {
			System.out.println("오류발생");
		}
	}
	
}
