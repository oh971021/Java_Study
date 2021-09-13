import java.util.Scanner;

public class Introduce {
	public static void main(String[] args) {
		// 자기소개
		
		// 콘솔에 다음을 출력하시오
		// 이름 : ㅇㅇ
		// 나이 : ㅇㅇ
		// 사는 곳 : ㅇㅇ
		Scanner s = new Scanner(System.in);
	
		System.out.print("이름을 입력하세요 : ");
		String name = s.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = s.nextInt();
		
		System.out.println();
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		
		if (name != " ") {
			System.out.printf("사는 곳 : %s\n", "대구");	
		} 
	}
}
