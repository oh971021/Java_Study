import java.util.Random;

import com.js.product.Computer;
import com.js.product.Printer;
import com.js.product.Scanner;

public class OPMain_1 {
	public static void main(String[] args) {
		
		// ��ǻ�� : �̸�, ����
			// cpu, ram, hdd
		Computer c = new Computer("������", 1000000);
		c.cpu = "i7";	// ���������ڸ� public ���� �س��� - ��𼭵� ���� ����
//		c.ram = 200; 	// ���������ڸ� default �� �س��� - ���� ��Ű�� �������� ��� �����ϴ�
//		c.hdd = 255;	// ���������ڸ� protected �� �س��� - ���� ��� ���� �ִ����� �ľ��ؾ� ��. 
		c.info();

		// ������ : �̸�, ����
		Printer p = new Printer("������", 100000);
		
		// ��ĳ�� : �̸�, ����
		Scanner s = new Scanner("��ĳ��", 80000);
		
		// Ŭ�������� ��ġ�� �� ������ ���������� �����Ѵ�.
		java.util.Scanner k = new java.util.Scanner(System.in);
		
		java.util.Random r = new Random();
		
		// java.lang�� �ִ°� import�� �ʿ����.
		java.lang.String str = new String("^_^");
		
	}
}
