public class OMain_3 {
	public static void main(String[] args) {
		// ���
		// �Ӽ� : �̸�, ����
		// �ڱ�Ұ� ���
		
		// �ؼ�, 25�� �ڱ�Ұ�
		Person Junseok = new Person();
		Junseok.name = "���ؼ�";
		Junseok.age = 25;
		Junseok.Introduce();
		
		System.out.println("=====================");
		
		Person Solri = new Person();
		Solri.name = "��ָ�";
		Solri.age = 28;
		Solri.Introduce();
		
		System.out.println("=====================");
		
		System.out.println(Junseok);
		System.out.println(Solri);
		Person Junseok2 = Junseok;
		System.out.println(Junseok2);
		
		System.out.println("=====================");
		
		Junseok2.name = "�ؼ�";
		Junseok.Introduce();
		Junseok2.Introduce();

		System.out.println("=====================");
		
		// null �� ���Խ����ָ� ������ ������ ������ �ִ� �������� �����ش�.
		Junseok2 = null;
		System.out.println(Junseok2);
		
		Junseok = null; // ��ó�� �����ϰ� �ִ� ���� ��θ� �����ָ� GC�� �ߵ��Ѵ�.

		// Garbage Collector :  Heap ������ �޸𸮸� �ڵ����� �������ش�.
		// �� �̻� �� ������ ����Ű�� ������ ���� �� �ߵ��ȴ�.
	}
}
