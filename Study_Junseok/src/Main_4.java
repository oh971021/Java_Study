abstract class Human { abstract void walk(); }
class Jun extends Human { 
	@Override
	void walk() { System.out.println("�Ƚ��ϴ�."); }
}

public class Main_4 {
	public static void main(String[] args) {
		Jun j = new Jun();
		j.walk();
	}
}
