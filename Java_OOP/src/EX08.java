
// abstract(�߻�����) : �߻� Ŭ������ ������ִ� ��ɾ�
// �߻�Ŭ������ ���� �� Ŭ������ �ν��Ͻ� ������ �Ұ����ϴ�.
abstract class Car08 {
	int speed;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
}

class Sedan08 extends Car08 {
	
}

class Truck08 extends Car08 {
	
}

public class EX08 {
	public static void main(String[] args) {
		Car08 car = new Car08();
		System.out.println("�ڵ��� ����!");
		
		Sedan08 sedan = new Sedan08();
		System.out.println("�¿��� ����!");
		Truck08 truck = new Truck08();
		System.out.println("Ʈ�� ����!");
		
	}
}
