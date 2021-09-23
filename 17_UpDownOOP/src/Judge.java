public class Judge {
	public void play(Enemy e, Player p) {
		// e가 랜덤 숫자를 뽑는다.
		int comNum = e.MakeNum();
		System.out.println(comNum);
		
		// p의 대답을 받는다.
		int playerNum = 0;
		boolean overGame = false;
		
		for (int turn = 1; true; turn++) {
			System.out.print("정답은 ");
			playerNum = p.say();
			
			overGame = result(comNum, playerNum, turn);
			if (overGame == true) {
				break;
			}
		}
	}
	
	// Judge가 판단하고 결과를 안내해준다.
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
