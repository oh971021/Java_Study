class Car03 {
	public Car03() {
		System.out.println("���� Ŭ���� �⺻ ������ (�Ķ���� ����)");
	}
	
	public Car03(String str) {
		System.out.println("���� Ŭ���� �����ε� ������ (" + str + ")");
	}
}

class Sedan03 extends Car03 {

	public Sedan03() {
//		super(); // ���� Ŭ������ �⺻ �����ڴ� ���� �ۼ������� �ʾƵ� ��.
		System.out.println("���� Ŭ���� �⺻ ������ (�Ķ���� ����)");
	}
	
	public Sedan03(String str) {
		super(str);
		System.out.println("���� Ŭ���� �����ε� ������ (" + str + ")");
	}
	
}

public class EX03 {
	public static void main(String[] args) {
		
		Car03 car03 = new Car03();
		
		Sedan03 sedan03 = new Sedan03("�����~");
	}
}
