
public class OMain_1 {
	public static void main(String[] args) {
		// ���� ���θ�

		// Goods�� ����!

		/*
		 * Products.getname();
		 * 
		 * Ŭ������ ��ü�� �������������� Ŭ���� ���� �޼ҵ忡 ������ �� ����.
		 * Ŭ������ �Ӽ��� ��ɸ��� ������ �ֱ⶧���� �� ���� Ȱ���� ��ü�� �����,
		 * �� ��ü�� ���� �����ϴ°� �����ϴ�.
		 * */
		
		// 1. ������� ���÷� ����
		// 2. ��ǰ ���� ��±��(����)

		// ������, 120����, ����
		Products iphone = new Products("������", 120);
		iphone.Info();

		// �����е�, 80����, ����
		Products ipad = new Products("�����е�", 80);
		ipad.Info();
		
		// ������, 20����, ����
		Products airpot = new Products("������", 20);
		airpot.Info();
		
		// Plus@ : �ѹ� ������ ��ǰ�� �̸��� ������ ������ �ȵǰ�
		// => ���͸� �����ش�.
		
		System.out.println(Products.getMaker());
	}
}
