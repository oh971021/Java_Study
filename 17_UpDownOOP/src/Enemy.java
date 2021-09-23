import java.util.Random;

public class Enemy extends Random {

	public int MakeNum() {
		return super.nextInt(99) + 1;
	}

}
