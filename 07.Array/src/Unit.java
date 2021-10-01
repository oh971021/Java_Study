import java.util.Scanner;

public class Unit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 1. Ű�� 8�� �� ���� �� Ű�� �´� �������� �����ؾ� ��. - HashMap���� ����
		// 2. 4���� ���� ���ǿ� ���� ���� ����Ǵ� ����� ��. - �޼ҵ�� �ʵ尪���� �ذ�
		
		double num;
		
		while (true) {
			// ���� ���� �ȳ�
			System.out.println("========= �ȳ� =========");
			// 1. cm -> inch
			System.out.println("1. cm -> inch�� ����");
			// 2. m^2 -> ��
			System.out.println("2. m^2 -> ������ ����");
			// 3. ���� -> ȭ��
			System.out.println("3. �� -> ���� ����");
			// 4. km/h -> mi/h
			System.out.println("4. km/h -> mi/h�� ����");

			System.out.print("�����Ͻ� ������ �������ּ��� : ");

			// ���� �ޱ� ( �� �Է� )
			int unit = s.nextInt();

			if (unit < 1 || unit > 4) {
				System.out.println("�Է� ����");
				continue;
			}

			// ��� �� �Է�
			System.out.print("���� �Ͻ� ���� �Է����ּ��� : ");
			num = s.nextDouble();
			
			// ��� �� ���
			if (unit == 1) {
				System.out.printf("%.2fcm �� %.2finch �Դϴ�.", num, cm_in(num));
				break;
			} else if (unit == 2) {
				System.out.printf("%.2fm2 �� %.2f�� �Դϴ�.", num, m2_sqm(num));
				break;
			} else if (unit == 3) {
				System.out.printf("����%.2f�� �� ȭ��%.2f�� �Դϴ�.", num, c_f(num));
				break;
			} else if (unit == 4) {
				System.out.printf("%.2fkm/h �� %.2fmi/h �Դϴ�.", num, km_mi(num));
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
