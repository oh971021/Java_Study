public class TCMain {
	public static void main(String[] args) {
		double a = 10 / 4;
		System.out.println(a);
		
		// 21�� .. long �� int ���� ū �׸�
		
		int aa = 10;
		long bb = aa;
		System.out.println(bb);
		
		int cc = (int) bb; // miss match (int �� long ���� ���� ũ��)
		
		double dd = cc; // �̰� �ǳ�?
		dd = 10.5;
		System.out.println(dd);
		
		int ee = (int) dd; // double -> int
		System.out.println(ee);
		// �� ��ȯ�� �������.
		// ������ ������ ���� �� �ִ�.
		
	}
}
