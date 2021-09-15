import java.util.Scanner;

/*
		 * 함수 : 기능을 모아놓은 박스 같은 것. 필요할 때 불러와서 사용한다.
		  
		 1. 함수 정의 
		 public static void 함수명() {
		 		내용
		 }
		 
		 1-1. 함수의 인자(argument), 매개변수(parameter) : 함수 수행에 필요한 것들
		 public static void 함수명(자로형 변수명, 자료형 변수명, ...(parameter) ) {
		 		내용
		 }
		 
		 2. 함수 호출 : 함수명(argument); // 함수에 넣은 인자를 써주고, 함수는 그 인자를 매개변수로 받는다. 
		 */

public class FMain_1 {
	public static void Info(String a, int b) {
		System.out.printf("이름 : %s\n ", a);
		System.out.printf("나이 : %d\n", b);
	}

	public static void Push(int cnt) {
		System.out.println("엎드려");
		System.out.println("=====");
		for (int i = 0; i < cnt; i++) {
			System.out.println("팔 굽혀");
			System.out.println("팔 펴");
		}
	}
	
	public static void Move(String a) {
		System.out.println("창고 가서 공 챙기고");
		Ball(a);
	}
	
	public static void Ball(String a) {
		if (a.equals("농구")) {
			System.out.println("농구공 가지고 강당 가");
		} else if (a.equals("축구")) {
			System.out.println("축구공 가지고 운동장 나가");
		} else {
			System.out.println("그런 공 없습니다");
		}
		System.out.println("공은 제자리에");
	}
	
	// void : return(출력)이 없는 것
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	
	// void를 자료형으로 대입하면 return값이 생성된다.
	public static int add2(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		Info("준석", 25);
		System.out.println("=======");
		Push(1);
		
		System.out.println("=======");
		
		// test
		// 농구 or 축구 입력에 따라 다른 처리.
			// sca (x) arg에 글자 적기
		
		// 창고 가서 (공가지러)
		// 농구공 가지고 강당 가
		Move("농구");
		
		// 축구공 가지고 운동장 가
//		Move("축구");
		// 체육시간 끝나면 공은 제자리에
		
		System.out.println("=======");
		add(1, 2);
		System.out.println(add2(1, 2));
	}
}
