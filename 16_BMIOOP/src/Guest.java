import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	Scanner mouth;
	double bmi;
	
	public void act2() {
		// �ǻ簡 ��� �ൿ�� ����ϱ�
		mouth = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = mouth.nextLine();
		System.out.printf("�̸� : %s\n", name);
		
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = mouth.nextDouble();
		System.out.printf("Ű : %.1fcm\n", height);
		
		System.out.print("ü���� �Է��ϼ��� : ");
		weight = mouth.nextDouble();
		System.out.printf("ü�� : %.1fkg\n", weight);

	}
}
