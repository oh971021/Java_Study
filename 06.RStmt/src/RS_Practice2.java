import java.time.Month;
import java.time.zone.ZoneOffsetTransitionRule;

public class RS_Practice2 {
	public static void main(String[] args) {
		
		// 이중 for문으로 달력만들기
//		int dayMax = 0;
//		
//		for (int month = 1; month < 12+1; month++) {
//			switch (month) {
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//				dayMax = 31;
//				break;
//			case 4: case 6: case 9: case 11:
//				dayMax = 30;
//				break;
//			case 2:
//				dayMax = 28;
//				break;
//			}
//		
//			for (int day=1; day<dayMax; day++) {
//				for (month=1; month<12+1; month++) {
//					System.out.printf("%d월 %d일\t",month,day);
//					System.out.print("|  ");
//				}
//				System.out.println();
//			}
//		}		

//		for (int day = 1; day <= 31; day++) {
//			for (int month = 1; month <= 12; month++) {
//				switch (month) {
//				case 2:
//					if (day > 28) {
//						System.out.print("\t\t    |");
//						continue;
//					}
//				case 4, 6, 9, 11:
//					if (day > 30) {
//						System.out.print("\t\t    |");
//						continue;
//					}
//				}
//				System.out.printf("\t%d월 %d일\t    |", month, day);
//			}
//			System.out.println();
//		}

//		for (int day = 1; day <= 32; day++) {
//			for (int month = 1; month <= 12; month++) {
//				if (month == 2 && day > 28) {
//					System.out.print("\t\t  |");
//					continue;
//				} else if ((month == 4 && day > 30) || (month == 6 && day > 30) || (month== 9 && day > 30) || (month == 11 && day > 30)) {
//					System.out.print("\t\t  |");
//					continue;
//				}
//				System.out.printf("%d월 %d일\t  |", month, day);
//			}
//			System.out.println();
//		}

		for (int day = 1; day <= 31; day++) {
			for (int month = 1; month <= 12; month++) {
				if ((month == 2 && day > 28) || ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
					System.out.print("\t\t  |");
					continue;
				}
				System.out.printf("%d월 %d일\t  |", month, day);
			}
			System.out.println();
		}
	}
}
