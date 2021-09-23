public class UDMain_1 {
	public static void main(String[] args) {
		// up down - oop version
		
		// player (맞추는 사람)
		Player p = new Player(); 
		// enemy (제출자)
		Enemy e = new Enemy();
		// judge (심판)
		Judge j = new Judge();
		
		// 심판이 게임을 진행시킨다.
		j.play(e, p);
	}
}