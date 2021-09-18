import java.nio.channels.ClosedByInterruptException;
import java.util.Scanner;

import org.w3c.dom.Text;

import jdk.internal.agent.resources.agent;

public class FMain_2 {
	// 월급을 넣으면 연봉을 구해서 '출력' 해주는 함수
	// 월급 * 12
	
	public static void getSalary(int month) {
		System.out.println("연봉 : " + (month * 12));
	}
	
	public static int getSalary2(int month) {
		int salary = (month * 12);
		return salary;
	}
	
	// 상품가격을 넣으면 부가세를 구해서 출력해주는 함수
	public static void VAT(int price) {
		System.out.println("부가세 : " + price * 0.08);
	}
	
	// 상품가격을 넣으면 부가세를 구해주는 함수
	public static double VAT2(int price) {
		return (price * 0.08);
	}
	
	public static void main(String[] args) {
		getSalary(100);
		System.out.println("-----------");
		int Salary = getSalary2(200);
		System.out.println("연봉 : " + Salary);
		System.out.println("-----------");
		
		int price = 1500;
		System.out.println("상품가격 : " + price);
		VAT(price);
		System.out.println("부가세 : " + VAT2(price));
		System.out.println("-----------");
		
		// 입력받을 준비
		Scanner s = new Scanner(System.in);
		
		System.out.print("중간 점수를 입력해주세요 : ");
		int score_J = s.nextInt();
		System.out.print("기말 점수를 입력해주세요 : ");
		int score_G = s.nextInt();
		
		double Score = Avg(score_J, score_G);
		System.out.println("평균 값 : " + Score);
		System.out.println("-----------");
		
		System.out.print("나이를 입력해주세요 : ");
		int age = s.nextInt();
		Hello(age);
		System.out.println("-----------");
		s.close();
	}
	
	// Test
	// 1. 중간, 기말 점수를 넣으면 평균을 구해주는 함수 (scan 사용)
	public static double Avg(int J, int G) {
		return ((J + G) / 2);
	}
	
	
	// 2. 나이를 넣으면 인사말을 출력해주는 함수 (scan 사용)
	public static void Hello(int age) {
		if (9 < age && age < 20) {
			System.out.println("안녕");
		} else if (19 < age && age < 30) {
			System.out.println("안녕하세요");
		} else if (30 <= age) {
			System.out.println("안녕하십니까");
		} else {
			System.out.println("돌아가요 꼬마친구");
		}
	}
	
	// 3. 숫자 두 개를 넣으면 더 큰 숫자를 구해주는 함수
		// 10, 20
	public static int Bigger(int a, int b) {
//		if (a > b) {
//			return a;
//		} else {
//			return b;
//		}
		
		return (a < b) ? b : a;
	}
}
