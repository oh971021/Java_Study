
public class OMain_1 {
	public static void main(String[] args) {
		
		// 실생활 반영
		
		// dog 강아지
		// age 나이가 3살
		int age = 3;
		// name 이름이 초코
		String name = "초코";
		// weight 체중이 3.5
		double weight = 3.5;
		
		System.out.println("강아지의 나이 : " + age + "살");
		System.out.println("강아지의 이름 : " + name);
		System.out.println("강아지의 체중 : " + weight + "kg");
		
		System.out.println("=======================");
		
		// 객체 : 세상에 존재하는 모든 것. (속성 + 기능)
		  // 객체를 만드려면 Class 를 만든다.
		// 속성 : 추상화 된 개념 눈에 보이지 않는 개념과 의미와 존재하는 개념 및 속성
		// 기능 : 속성을 사용하는 방법
		
		// 실체화 (인스턴스, 객체 생성)
		// 클래스명 변수명 = new 클래스명();
		// 나이가 3살이고, 이름이 초코, 체중이 3.5인 강아지
		
		Dog coco = new Dog(); // 객체, 인스턴스(강아지) 생성
		coco.PrintInfo("코코", 3, 3.5);
		for (int i = 0; i < 2; i++) {
			coco.Bark();
		}
		coco.Sit("앉아");
		
		
		// 2번째 강아지를 만들어봅시다.
		// 요미, 1살, 1.5kg
		
		Dog yomi = new Dog();
		yomi.PrintInfo("요미", 1, 1.5);
		yomi.Bark();
		
		System.out.println("=======================");
		
		// 컴퓨터를 객체로 표현해주세요.
		
		// 설계도 : CPU:2.5, RAM:8, HDD:256
		// PrintInfo로 정보 찍기

		Computer myCom = new Computer();
		
		myCom.name = "오준석";
		myCom.CPU = 2.5;
		myCom.RAM = 8;
		myCom.HDD = 256;
		
		myCom.computerInfo();
		myCom.mouse.Click("left");
		myCom.keyboard.Print();
		
	}
}
