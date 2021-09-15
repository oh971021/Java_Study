import java.util.Scanner;

public class AMain_3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// 4칸 짜리 인스턴스 생성
		int[] val = new int[4];
		// 총합 그릇 만들기
		int sum = 0;
		// ㅇㅇ번 숫자 입력
		for (int i = 0; i < val.length; i++) {
			// 입력을 받기위한 스캐너 사용 (총 4개 받음)
			System.out.printf("%d번 번호 입력 : ", (i+1));
			val[i] = s.nextInt();
			// 대입값 그릇에 넣어서 더하기
//			sum += val[i];
		}
		// 다 더한 총 합계 출력 ( foreach 방식 )
		// i 값을 val 값으로 돌린다. 
		for (int i : val) {
			// 그 값을 sum에 대입시킨다.
			sum += i;
		}
		
		// 총합 출력
		System.out.println("총합 : " + sum);
		
	}
}
