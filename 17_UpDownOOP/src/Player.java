import java.util.Scanner;

public class Player {
	
	Scanner mouth;
	
	// 플레이어가 생성될 때 말할 수 있는 능력을 얻는다.
	public Player() {
		mouth = new Scanner(System.in);
	}
	
	public int say() {
		return mouth.nextInt();
	}

}
