import java.util.Scanner;

public class AMain_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int aa[] = new int[4]; // 4ĭ ¥���� ������ �����. (ĭ�� index, ����)
		int a = 0;
		int hap = 0;
		
		System.out.print("1�� ���� : ");
		aa[0] = s.nextInt();
		System.out.print("2�� ���� : ");
		aa[1] = s.nextInt();
		System.out.print("3�� ���� : ");
		aa[2] = s.nextInt();
		System.out.print("4�� ���� : ");
		aa[3] = s.nextInt();
		
		System.out.printf("���� : %d", (aa[0]+aa[1]+aa[2]+aa[3]));
	}
}
