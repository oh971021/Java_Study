import java.util.Arrays;
import java.util.Iterator;

public class Amain_2 {
	public static void main(String[] args) {
		
		// 학생의 일어점수가 90점
		
		int JPscore = 90;
		System.out.println(JPscore);
	
		// 배열 ( Reference type )
		
		// 학생 5명의 영어점수
		int engScore[] = new int[5]; // 5칸 변수 선언 [0:4]
		System.out.println(engScore);
		
		engScore[0] = 100;
		engScore[1] = 90;
		engScore[2] = 80;
		engScore[3] = 70;
		engScore[4] = 60;
		
		System.out.println("4번째 학생의 점수 : " + engScore[3]);
		
		System.out.println("=============================");
		
		// 값을 알고 있을 때 (변수 선언, 초기화를 같이)
		
//		int engTest[] = new int[] {10, 20, 30, 40, 50};
		int engTest[] = {10, 20, 30, 40, 50}; // 선언과 초기화를 한꺼번에 한다.
		
		System.out.println(engTest[1]);
		
		int engTest2[] = engTest;
		System.out.println(engTest2.equals(engTest));
		
		System.out.println(engTest);
		System.out.println(engTest2);
		
		System.out.println("=============================");
		
		// jpTest 5명 학생 50 ~ 90
		int jpTest[] = {50,60,70,80,90};
		
		// 배열길이 출력
		System.out.println(jpTest.length);
		
		int a = 0;
		
		// 전체 평균 계산해서 출력
		for (int i = 0; i < jpTest.length; i++) {
			a += jpTest[i];
		}
		System.out.println("총합은 " + a);
		
		int avg = a / jpTest.length;
//		int avg = ((jpTest[0] + jpTest[1] + jpTest[2] + jpTest[3] + jpTest[4])/jpTest.length);
		System.out.println("평균은 " + avg);
		
		System.out.println("=============================");
		
		int count = 0;
		float Avgs = 0f;
		
		for (int i = 0; i < jpTest.length; i++) {
			count += jpTest[i];
		}
		
		Avgs = count / jpTest.length;
		
		System.out.println("총합 : " + count);
		System.out.println("평균 : " + Avgs);
		
		System.out.println("=============================");
		
		// 가로로 값 출력하기
		System.out.println(Arrays.toString(jpTest));
		
		System.out.println("=============================");
		
		// foreach(배열) : 증감 개념이 없고, 순차적으로 모두 출력함.
		for (int i : jpTest) {
			System.out.println(i);
		}
		
		System.out.println("=============================");
		
		// engScore 2번째 연습
		System.out.println(engScore[1]);
		
		// 그거의 길이(크기)
		System.out.println(engScore.length);
		
		// for문으로 하나씩 출력
		for (int i = 0; i < engScore.length; i++) {
			System.out.println(engScore[i]);
		}
		
		// foreach로 하나씩 출력
		for (int i : engScore) {
			System.out.println(i);
		}
		
		System.out.println("=============================");
		
		// 학생 3명의 이름을 담자
		String[] names = {"오준석", "노솔리", "이명재"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println("=============================");
		
		int[] push = new int[5]; // 5칸 짜리 인스턴스 생성 
		
		int sum = 0;
		
		for (int i = 0; i < push.length; i++) {
			push[i] = i+1;
			sum += push[i];
			System.out.print(sum + ",");
		}
		System.out.println(sum);
		
		System.out.println("=============================");
		
		int jpTestSum = 0;
		int jpTestAvg = 0;
		for (int i : jpTest) {
			jpTestSum += i;
		}
		jpTestAvg = jpTestSum / jpTest.length;
		System.out.println("평균 값 : " + jpTestAvg);
		
	}
}
