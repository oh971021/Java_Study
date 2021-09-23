import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	Scanner mouth;
	double bmi;
	
	public void act2() {
		// 의사가 물어본 행동에 대답하기
		mouth = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = mouth.nextLine();
		System.out.printf("이름 : %s\n", name);
		
		System.out.print("키를 입력하세요 : ");
		height = mouth.nextDouble();
		System.out.printf("키 : %.1fcm\n", height);
		
		System.out.print("체중을 입력하세요 : ");
		weight = mouth.nextDouble();
		System.out.printf("체중 : %.1fkg\n", weight);

	}
}
