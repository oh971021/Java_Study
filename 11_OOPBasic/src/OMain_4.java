public class OMain_4 {
	public static void main(String[] args) {
	      
	      //1.ǰ���� ������, ������ 500��, �������� �߱�
	      //2.ǰ���� ���帶ī, ������ 1000��, �������� �ѱ�
		
	      //����(��ǰ)
	      Product shopping1 = new Product();
	      //ǰ��
	      shopping1.item = "������";
	      //����
	      shopping1.price = 500;
	      //������
	      shopping1.origin = "�߱�";
	      
	      //����(��ǰ)
	      Product shopping2 = new Product();
	      //ǰ��
	      shopping2.item = "���帶ī";
	      //����
	      shopping2.price = 1000;
	      //������
	      shopping2.origin = "�ѱ�";
	      
	      //��ǰ���� ��� ����
	      shopping1.printInfo();
	      shopping2.printInfo();

	}
}
