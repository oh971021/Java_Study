import java.util.Random;

// ����̰� �ɳ���ġ�� ������ ������ �����Ѵ�..
public class OSub_1 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.CatInfo("�߿���", 5);
		
		System.out.print("�ɳ���ġ �߻� ");
		cat.Nyangnyang_Punch();
		
		// �´� ����� �������� 0�� 1�� �����.
		Random r = new Random();
		int punch = r.nextInt(2);
		
		// �ɳ���ġ�� ������ "�ƾ�"
		// ���ϸ� "����"
		if (punch == 1) {
			System.out.println("��������");
		} else {
			System.out.println("�ƾ�...");
		}
		
	}
}
