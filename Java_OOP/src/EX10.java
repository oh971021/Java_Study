interface Car10 {
	// �������̽��� ����� �߻�޼ҵ�ۿ� ������ ���Ѵ�.
	
	// ����� public static final �� ������ �����ϴ�
	String CAR_TYPE = "�¿���";
	
	// �߻�޼ҵ�� body�� ����
	void work();
}

class Sedan10 implements Car10 {
	
	@Override
	public void work() {
		System.out.println("�¿����� ����� �¿�");
	}
}

class Truck10 implements Car10 {
	
	@Override
	public void work() {
		System.out.println("Ʈ���� ���� �ư� ����");
	}
}

public class EX10 {
	public static void main(String[] args) {
		
		
		
	}
}
