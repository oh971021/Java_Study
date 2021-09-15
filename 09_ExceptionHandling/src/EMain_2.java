import java.util.Scanner;

public class EMain_2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("X : ");
		int x = s.nextInt();
		System.out.print("Y : ");
		int y = s.nextInt();

		// 일단 Try 를 실행하고, 문제가 발생하면 catch로 넘어간다.

		try {
			System.out.println(x / y);
			
			int[] ar = {10, 20};
			System.out.println("배열의 몇번? ");
			int i = s.nextInt();
			System.out.println(ar[i]);
			
			// 해당하는 예외 에러에 따라 catch 문법을 사용해서 예외처리를 해준다.
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace(); // 개발자 확인용
		}

//		try {
//			System.out.println(x / y);
//			
//			int[] ar = {10, 20};
//			System.out.println("배열의 몇번? ");
//			int i = s.nextInt();
//			System.out.println(ar[i]);
//			
//			// 해당하는 예외 에러에 따라 catch 문법을 사용해서 예외처리를 해준다.
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("0이나 1중 입력 해주세요.");
//			// e.printStackTrace(); // 개발자 확인용
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			// e.printStackTrace();
//		}
		
	}


	public static void test() throws ArrayIndexOutOfBoundsException {
		int aa[] = {1};
		System.out.println(aa[3]);
	}
	

	public static void test2() {
		int aa[] = {1};
		try {
			System.out.println(aa[3]);
		} catch (Exception e) {
			System.out.println("오류 발생");
		}
	}
	
}
