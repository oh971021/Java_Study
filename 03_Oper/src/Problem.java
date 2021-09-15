import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		// 숫자 4개를 하나씩 입력
		// 입력 1 :
		// 입력 2 :
		// 입력 3 :
		// 입력 4 :
		
		// 결과(총합) : 

		Scanner s = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int one = s.nextInt();
		System.out.print("입력2 : ");
		int two = s.nextInt();
		System.out.print("입력3 : ");
		int three = s.nextInt();
		System.out.print("입력4 : ");
		int fore = s.nextInt();
		
		int total = one + two + three + fore;
		
		System.out.print(one + "+" + two + "+" + three + "+" + fore + " = ");
		System.out.println(total);
		
	}
}
