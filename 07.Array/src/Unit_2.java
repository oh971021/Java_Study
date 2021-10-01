import java.util.HashMap;
import java.util.Scanner;

public class Unit_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
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

		System.out.print("������ ������ �������ּ��� : ");

		// ���� �ޱ� ( �� �Է� )
		int unit = s.nextInt();

		System.out.print("������ ���� �Է����ּ��� : ");
		int num = s.nextInt();
		
		// Ű ���� ��Ƽ��, ��°��� ����� ����.
		HashMap<Integer, Double> convert = new HashMap<Integer, Double>();
		convert.put(1, num*2.54);
		convert.put(2, num*0.3025);
		convert.put(3, (num*1.8) + 32.0);
		convert.put(4, num*0.6214);
		
		System.out.println(convert.get(unit));
	}
}
