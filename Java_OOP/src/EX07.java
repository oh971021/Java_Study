class Car07 {
	private int speed;
	
	// �޼ҵ忡 ���ȭ�� ��Ű�� ��.
	// �ٸ� Ŭ������ ��� ���� Ŭ�������� �������̵��� �Ұ����ϴ�.
	final void upSpeed(int speed) {
		this.speed += speed;
	}
}

class Sedan07 extends Car07 {
	
	// ���ȭ ��Ű�� '�빮��'�� �����
	static final String CAR_TYPE = "�¿���";

}

public class EX07 {
	public static void main(String[] args) {
		
		Sedan07 sedan = new Sedan07();
		System.out.println(sedan.CAR_TYPE);
		sedan.upSpeed(150);
		
	}
}
