
public class ICMain_1 {
	public static void main(String[] args) {

		// ����
		// 1. �ν��Ͻ� ������ �� �־ ����
		// 2. ��� �ʵ�� �������� �� �� ������ �Ѵ�.
		
		// ������ī
		Car sportCar = new Car("�ΰ�Ƽ", "321�� 5959");
			// �𵨸�, �ѹ� > �������
			sportCar.info();
		
		// �ý�
		Taxi taxi = new Taxi("�Ÿ", "59�� 3535", 3300);
			// �𵨸�, �ѹ�, �⺻�� > �������
			taxi.info();
		
		// ����
		Bus bus = new Bus("ī��Ƽ", "35�� 1515", 909);
			// �𵨸�, �ѹ�, �뼱��ȣ > �������
			bus.info();
		
	
		
		
	}
}
