
public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޷� ���� ���
		// 2�� for�� switch case�� �� �����ؼ� ���η� �̱�
		//			if���� �翬�� ����
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
				System.out.printf("%d�� %d��\n", month, day);
			}
		}

	}

}