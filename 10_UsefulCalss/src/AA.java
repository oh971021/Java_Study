import java.util.Scanner;

public class AA {
	//월급을 넣으면 연봉을 구해서 '출력'해주는 함수
	//월급*12
	public static void getSalary(int month) {
		System.out.println("연봉: " + (month * 12));
	}
	
	// 월급을 넣으면 연봉을 구해주는 함수
	public static int getSalary2(int month) {
		int salary = month * 12;
		return salary;
	}
	
	// 상품가격을 넣으면 부가세를 구해주는 함수
	public static void vat(int price) {
		System.out.println(price-(int)(price*0.08));
	}
	// 상품가격을 넣으면 부가세를 '출력'해주는 함수
	public static int vat2(int price) {
		int vat = (int) (price-(price*0.08));
		return vat;
	}
	//Test (다른 메서드 참고 하지말고)
	//1. 중간, 기말 점수를 넣으면 평균을 구해주는 함수 (scanner로 중간기말 입력받기)
	public static void test(int score1, int score2) {
		System.out.println("당신의 평균점수는 : " + (score1+score2)/2);
	}
	//2. 나이를 넣으면 인사말을 출력해주는 함수(scanner로 입력받기)
	public static void hi(int age) {
		if(age > 9 && age <20) {
			System.out.println("안녕");
		}else if(age > 20 && age <30) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("안녕하십니까");
		}
	}
	//10대 : 안녕
	//20대 : 안녕하세요
	//그 이상 : 안녕하십니까
	
	// 숫자 2개를 넣으면 더큰 숫자를 구해주는 함수
	public static int getBigger(int a, int b) {
//		if(a>b) {
//			return a;
//		}
//			return b;
		return(a < b)? b :a ;
	}
	
	
	public static void main(String[] args) {
//		getSalary(100);
//		System.out.println("--------------------------");
//		System.out.println(getSalary2(200));
//		System.out.println("--------------------------");
		
		vat(5000);
		System.out.println(vat2(5000));
		
		System.out.println("--------------------------");
		System.out.println("기말고사와 중간고사 점수를 입력하세요>>>");
		Scanner s = new Scanner(System.in);
		int score1 = s.nextInt();
		int score2 = s.nextInt();	
		test(score1, score2);
		
		System.out.println("--------------------------");
		System.out.println("나이를 입력하세요>>>");
		int age = s.nextInt();
		hi(age);
		System.out.println("--------------------------");
		System.out.println(getBigger(30, 10));

	}
}
