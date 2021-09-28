abstract class Afreca {
	abstract void where();
}

abstract class Coffeecong extends Afreca {
	abstract void price();
}

abstract class Coffee extends Coffeecong {
	abstract void name();
}

class Americano extends Coffee {
	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("아메리카노");
	}
	@Override
	void price() {
		// TODO Auto-generated method stub
		System.out.println("2000원");
	}
	@Override
	void where() {
		// TODO Auto-generated method stub
		System.out.println("아프리카");
	}
}

public class Main_5 {
	public static void main(String[] args) {
		Americano americano = new Americano();
		
		americano.name();
		americano.price();
		americano.where();
	}
}
