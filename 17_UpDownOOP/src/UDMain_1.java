public class UDMain_1 {
	public static void main(String[] args) {
		// up down - oop version
		
		// player (���ߴ� ���)
		Player p = new Player(); 
		// enemy (������)
		Enemy e = new Enemy();
		// judge (����)
		Judge j = new Judge();
		
		// ������ ������ �����Ų��.
		j.play(e, p);
	}
}