abstract class Car09 {	// �߻�Ŭ����
	int speed;
	String color;
	
	void upSpeed(int speed) {
		this.speed = speed;
	}
	
	// �߻�޼ҵ�� Body("{}") �� ���� �� ����.
	// �߻�޼ҵ�� �߻�Ŭ���� �������� ������ �� �ִ�.
	abstract void work();
	
}

class Sedan09 extends Car09 {
	
	// �߻� �޼ҵ�� ���� Ŭ�������� �ݵ�� �������ؼ� ����ؾ� �Ѵ�.
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("�¿����� ����� �¿�");
	}
}

class Truck09 extends Car09 {
	
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("Ʈ���� ���� �ư� ����");
	}
}

public class EX09 {
	public static void main(String[] args) {
//		Car09 car = new Car09();	// �߻�Ŭ������ �ν��Ͻ� ���� X
//		System.out.println("�ڵ��� ����!");
//		
		Sedan09 sedan = new Sedan09();
		System.out.println("�¿��� ����!");
		sedan.work();
		Truck09 truck = new Truck09();
		System.out.println("Ʈ�� ����!");
		truck.work();
		
	}
}
