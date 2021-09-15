import java.util.Scanner;

public class AMain_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int aa[] = new int[4]; // 4칸 짜리의 변수를 만든다. (칸은 index, 색인)
		int a = 0;
		int hap = 0;
		
		System.out.print("1번 숫자 : ");
		aa[0] = s.nextInt();
		System.out.print("2번 숫자 : ");
		aa[1] = s.nextInt();
		System.out.print("3번 숫자 : ");
		aa[2] = s.nextInt();
		System.out.print("4번 숫자 : ");
		aa[3] = s.nextInt();
		
		System.out.printf("총합 : %d", (aa[0]+aa[1]+aa[2]+aa[3]));
	}
}
