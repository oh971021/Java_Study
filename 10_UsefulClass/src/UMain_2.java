import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UMain_2 {
	public static void main(String[] args) {
		
		// �ð��� ��¥ (Datetype)
		// java.util�� �ִ°�
		Date d = new Date();
		System.out.println(d); // ������ ����
		
		/*
			Date -> String
			y(��) M(��) d(��) a(����/����) h(��) m(��) s(��)
		
		*/
		
		// �� �� �� �� 
		SimpleDateFormat sdf = new SimpleDateFormat("MMMdd�� hh�� mm��");
		System.out.println(sdf.format(d));
		
		String string = sdf.format(d);
		System.out.println(string);
		
		System.out.println("============================");
		
		// Test
		
		// 1. sdf2�� ��:��:��
		SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(sdf2.format(d));
		
		// String -> date Ÿ������ ����
		String ds = "94-03-02";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy-MM-dd");
		
		// String���� Date�� ��ȯ�� ��, ����ó���� ����Ѵ�.
		try {
			Date d2 = sdf3.parse(ds);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
