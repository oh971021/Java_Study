import java.util.ArrayList;
import java.util.Iterator;

public class CMain_2 {
	public static void main(String[] args) {
		
		/*
		Car[] car1 x 50000
					+++ 추가생산
		*/
		
		// List 계열 : 가변 사이즈 배열		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2.1);
		al.add("3");	// 자료형 섞어 쓰는 것도 가능 ( 잘 안씀 )
		
		// 배열에서 length 로 사이즈를 확인했지만
		// 리스트에서는 size 로 사이즈를 확인한다.
		System.out.println(al.size());
		
		System.out.println("===================");
	
		// <클래스명> : Generic -> 리스트의 데이터 타입을 정해주는 것.
		// 아래의 리스트는 String이 Generic으로 지정되어있어, 다른 타입은 넣을 수 없다.
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Hello");
		al2.add("Java");
		al2.add("Array");
		
		System.out.println(al2.size());
						// al2.length -> al2.size ( 리스트에서의 차이 )
		System.out.println(al2.remove(2));
		System.out.println(al2);
		System.out.println(al2.add("Array"));
		
		// 배열의 베프 foreach문
		for (String s : al2) {
			System.out.println(s);			
		}
		
		// 동적인 사이즈라 계속 추가 가능하다.
		al2.add("Start");
		al2.add(0, "Eclipse");
		
		// Index에 따라 값 셋팅도 가능
		al2.set(2, "JAVA");
		
		// Index에 따라 값 삭제도 가능
		al2.remove(4);
		
		System.out.println("===================");
		
		// 배열의 친구 for문
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		
		System.out.println("===================");
		
		// al3를 만들어서 10, 20을 넣고 다 출력
		// 잘 안쓰는 형태 X > Generic을 써서 타입을ㅈ ㅣ정해주기
		
		// Generic 안에는 기본형을 넣을 수 없다.
		// 기본 자료형은 랩터형?? 으로 작성해주면 된다.
		// 그 자료형의 참조타입을 찾는다.
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		al3.add(10);
		al3.add(20);
		
		for (Integer s : al3) {
			System.out.println(s);
		}
		
		System.out.println("===================");
		
		
		
		
	}
}
