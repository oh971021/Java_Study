import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		// ���� 4���� �ϳ��� �Է�
		// �Է� 1 :
		// �Է� 2 :
		// �Է� 3 :
		// �Է� 4 :
		
		// ���(����) : 

		Scanner s = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int one = s.nextInt();
		System.out.print("�Է�2 : ");
		int two = s.nextInt();
		System.out.print("�Է�3 : ");
		int three = s.nextInt();
		System.out.print("�Է�4 : ");
		int fore = s.nextInt();
		
		int total = one + two + three + fore;
		
		System.out.print(one + "+" + two + "+" + three + "+" + fore + " = ");
		System.out.println(total);
		
	}
}
