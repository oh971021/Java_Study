import java.util.HashMap;
import java.util.Scanner;

public class Unit_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 변경 단위 안내
		System.out.println("========= 안내 =========");
		// 1. cm -> inch
		System.out.println("1. cm -> inch로 변경");
		// 2. m^2 -> 평
		System.out.println("2. m^2 -> 평으로 변경");
		// 3. 섭씨 -> 화씨
		System.out.println("3. ℃ -> ℉로 변경");
		// 4. km/h -> mi/h
		System.out.println("4. km/h -> mi/h로 변경");

		System.out.print("변경할 단위를 선택해주세요 : ");

		// 선택 받기 ( 값 입력 )
		int unit = s.nextInt();

		System.out.print("변경할 값을 입력해주세요 : ");
		int num = s.nextInt();
		
		// 키 값을 인티져, 출력값을 더블로 만듬.
		HashMap<Integer, Double> convert = new HashMap<Integer, Double>();
		convert.put(1, num*2.54);
		convert.put(2, num*0.3025);
		convert.put(3, (num*1.8) + 32.0);
		convert.put(4, num*0.6214);
		
		System.out.println(convert.get(unit));
	}
}
