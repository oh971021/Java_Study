import java.util.Scanner;

// 설계도 : CPU:2.5, RAM:8, HDD:256
public class Computer {
	String name;
	double CPU;
	int RAM;
	int HDD;

	Mouse mouse = new Mouse();
	Keyboard keyboard = new Keyboard();
	
	void computerInfo() {
		System.out.println("사용자명 : "+name);
		System.out.println("CPU:"+CPU+"hz"+"  RAM:"+RAM+"MB"+"  HDD:"+HDD+"GB");
	}
}

class Mouse {
	public void Click(String value) {
		if (value.equals("left")) {
			System.out.println("just click");
		} else if (value.equals("right")) {
			System.out.println("system info");
		} else {
			System.out.println("Can't Click");
		}
	}
}

class Keyboard {
	public void Print() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력할 값을 입력해주세요 : ");
		String value = s.nextLine();
		System.out.println("검색한 값 : " + value);
	}
}