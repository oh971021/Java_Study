public class OMain_2 {
	public static void main(String[] args) {
		// Ŀ��
		Coffee americono = new Coffee();
		americono.price = 2000;
		americono.kinds = "�Ƹ޸�ī��";
		
		Coffee cafeLatte = new Coffee();
		cafeLatte.price = 3000;
		cafeLatte.kinds = "ī�����";
		
		americono.coffeeInto();
		cafeLatte.coffeeInto();
	}
}
