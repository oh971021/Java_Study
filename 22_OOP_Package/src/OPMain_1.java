import java.util.Random;

import com.js.product.Computer;
import com.js.product.Printer;
import com.js.product.Scanner;

public class OPMain_1 {
	public static void main(String[] args) {
		
		// 컴퓨터 : 이름, 가격
			// cpu, ram, hdd
		Computer c = new Computer("슈퍼컴", 1000000);
		c.cpu = "i7";	// 접근제한자를 public 으로 해놨음 - 어디서든 접근 가능
//		c.ram = 200; 	// 접근제한자를 default 로 해놨음 - 같은 패키지 내에서만 사용 가능하다
//		c.hdd = 255;	// 접근제한자를 protected 로 해놨음 - 내가 어디서 쓰고 있는지를 파악해야 함. 
		c.info();

		// 프린터 : 이름, 가격
		Printer p = new Printer("프린터", 100000);
		
		// 스캐너 : 이름, 가격
		Scanner s = new Scanner("스캐너", 80000);
		
		// 클래스명이 겹치는 게 있으면 폴더명으로 접근한다.
		java.util.Scanner k = new java.util.Scanner(System.in);
		
		java.util.Random r = new Random();
		
		// java.lang에 있는건 import가 필요없다.
		java.lang.String str = new String("^_^");
		
	}
}
