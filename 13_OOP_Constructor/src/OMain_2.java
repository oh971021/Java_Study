import java.util.Scanner;

public class OMain_2 {
	// ���α׷��� ����
	
	// �̸� : String
	// ���� : int
	// �߱� : boolean
	
	// p1.work()      // ������
	// p1.work("��") // �ڵ��ϱ�
	// p1.work("���") // �����

	public static void main(String[] args) {
		Programer p1 = new Programer("���ؼ�", 25, true);
		
		Scanner s = new Scanner(System.in);
		
		String what = s.nextLine();
		
		p1.work();
		p1.work(what);
	}
}