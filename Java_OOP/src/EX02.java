class Car02 {
	
	public Car02() {
		System.out.println("���� Ŭ���� ������ ȣ��!");
	}
}

class Sedan02 extends Car02 {
	
	public Sedan02() {
		System.out.println("���� Ŭ���� ������ ȣ��!");
	}
}

public class EX02 {
	public static void main(String[] args) {
		
		Sedan02 sedan02 = new Sedan02();
		
	}
}
