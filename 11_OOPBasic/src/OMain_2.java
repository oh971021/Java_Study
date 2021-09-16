public class OMain_2 {
	public static void main(String[] args) {
		// 커피
		Coffee americono = new Coffee();
		americono.price = 2000;
		americono.kinds = "아메리카노";
		
		Coffee cafeLatte = new Coffee();
		cafeLatte.price = 3000;
		cafeLatte.kinds = "카페라테";
		
		americono.coffeeInto();
		cafeLatte.coffeeInto();
	}
}
