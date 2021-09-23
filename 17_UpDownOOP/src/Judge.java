public class Judge {
	public void play(Enemy e, Player p) {
		// e�� ���� ���ڸ� �̴´�.
		int comNum = e.MakeNum();
		System.out.println(comNum);
		
		// p�� ����� �޴´�.
		int playerNum = 0;
		boolean overGame = false;
		
		for (int turn = 1; true; turn++) {
			System.out.print("������ ");
			playerNum = p.say();
			
			overGame = result(comNum, playerNum, turn);
			if (overGame == true) {
				break;
			}
		}
	}
	
	// Judge�� �Ǵ��ϰ� ����� �ȳ����ش�.
	private boolean result(int comNum, int playerNum, int turn) {

		if (comNum == playerNum) {
			System.out.printf("Correct! you tried %d times!", turn);
			return true;
		} else if (comNum < playerNum) {
			System.out.println("Down");
		} else {
			System.out.println("Up");
		}
		return false;
	}
}
