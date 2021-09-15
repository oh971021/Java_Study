
public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 달력 세로 출력
		// 2중 for문 switch case로 값 조절해서 세로로 뽑기
		//			if문도 당연히 가능
		int dayMax = 0;
		for (int month = 1; month <= 12; month++) {
			switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				dayMax = 31;
			break;
			case 4: case 6: case 9: case 11:
				dayMax = 30;
			break;
			case 2:
				dayMax = 28;
				break;
			}
			for (int day = 1; day <= dayMax; day++) {
				System.out.printf("%d월 %d일\n", month, day);
			}
		}

	}

}