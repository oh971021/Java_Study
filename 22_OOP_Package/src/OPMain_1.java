import com.js.product.Computer;

public class OPMain_1 {
	public static void main(String[] args) {
		
		// ��ǻ�� : �̸�, ����
			// cpu, ram, hdd
		Computer c = new Computer("������", 1000000);
		c.cpu = "i7";	// ���������ڸ� public ���� �س��� - ��𼭵� ���� ����
		c.ram = 200; 	// ���������ڸ� default �� �س��� - ���� ��Ű�� �������� ��� �����ϴ�
		c.hdd = 255;	// ���������ڸ� protected �� �س��� - ���� ��� ���� �ִ����� �ľ��ؾ� ��. 
		

		// ������ : �̸�, ����
		
		// ��ĳ�� : �̸�, ����
		
	}
}
