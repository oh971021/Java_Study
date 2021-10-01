import java.util.Scanner;

public class Unit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 1. 키는 8개 그 값을 그 키에 맞는 조건으로 변경해야 함. - HashMap으로 접근
		// 2. 4개의 변경 조건에 따라 값이 변경되는 방식을 함. - 메소드랑 필드값으로 해결
		
		double num;
		
		while (true) {
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

			System.out.print("변경하실 단위를 선택해주세요 : ");

			// 선택 받기 ( 값 입력 )
			int unit = s.nextInt();

			if (unit < 1 || unit > 4) {
				System.out.println("입력 오류");
				continue;
			}

			// 계산 값 입력
			System.out.print("변경 하실 값을 입력해주세요 : ");
			num = s.nextDouble();
			
			// 계산 값 출력
			if (unit == 1) {
				System.out.printf("%.2fcm 는 %.2finch 입니다.", num, cm_in(num));
				break;
			} else if (unit == 2) {
				System.out.printf("%.2fm2 는 %.2f평 입니다.", num, m2_sqm(num));
				break;
			} else if (unit == 3) {
				System.out.printf("섭씨%.2f도 는 화씨%.2f도 입니다.", num, c_f(num));
				break;
			} else if (unit == 4) {
				System.out.printf("%.2fkm/h 는 %.2fmi/h 입니다.", num, km_mi(num));
				break;
			}
		}
	}
	
	public static double cm_in(double cm) {
		return (cm / 2.54);
	}

	public static double m2_sqm(double m2) {
		return (m2 / 3.3);
	}

	public static double c_f(double c) {
		return ((c * (9/5)) + 32);
	}

	public static double km_mi(double km) {
		return (km * 0.62);
	}
}
