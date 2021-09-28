import com.js.product.Computer;

public class OPMain_1 {
	public static void main(String[] args) {
		
		// 컴퓨터 : 이름, 가격
			// cpu, ram, hdd
		Computer c = new Computer("슈퍼컴", 1000000);
		c.cpu = "i7";	// 접근제한자를 public 으로 해놨음 - 어디서든 접근 가능
		c.ram = 200; 	// 접근제한자를 default 로 해놨음 - 같은 패키지 내에서만 사용 가능하다
		c.hdd = 255;	// 접근제한자를 protected 로 해놨음 - 내가 어디서 쓰고 있는지를 파악해야 함. 
		

		// 프린터 : 이름, 가격
		
		// 스캐너 : 이름, 가격
		
	}
}
