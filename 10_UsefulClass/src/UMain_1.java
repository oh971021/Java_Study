import java.util.Scanner;
import java.util.StringTokenizer;

public class UMain_1 {
	public static void main(String[] args) {
		
		String s = "�ȳ�";
		String ss = new String("�Ϳ� �� ����");
		
		//ss�� �ι� ° ���ڸ� ��� : �ε����� ���� ��� (charat)
		System.out.println(ss.charAt(0));
		
		//ss�� ���� ° ���ڸ� ���
		System.out.println(ss.charAt(2));

		//ss�� ��ü ���� ���� ���
		System.out.println(ss.length());
		
		System.out.println("=============");
		
		// ss���� '��' �̶�� ���ڰ� �� ��°�� �ִ°�
			System.out.println(ss.indexOf("��"));
		// ss�� '��' �� �����ϴ°�?
			System.out.println(ss.startsWith("��"));
		// ss�� '��' ���� �����°�?
			System.out.println(ss.endsWith("��"));
		// ss�� '��' ���� �����°�?
			System.out.println(ss.endsWith("��"));
			
		// ss�� '��' �� '����' �� �ٲ㺸��
			String string = ss.replace("��", "����");
				System.out.println(string);
		// ss�� 2~4��° ��¥ ���
			System.out.println(string.substring(1, 4));
			
		System.out.println("============");
		
		String sss = "���,����,�ٳ���";
		
		// ���ڿ� �и�
		
		// 1. �迭�� �����ϱ�
		String[] sss2 = sss.split(",");
		
		for (String sss3 : sss2) {
			System.out.println(sss3);
		}
		
		System.out.println("============");
		
		// 2. ���ο� ��ü�� �и��ϱ� (knife)
		StringTokenizer st = new StringTokenizer(sss, ",");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
		
		System.out.println("============");	
		
		StringTokenizer st2 = new StringTokenizer(sss, ",");
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		System.out.println("============");	
		
		// ���ڿ� ������
		String st1 = "��";
		st1 += "��";
		st1 += "��";
		st1 += "��";
		st1 += "��";
		System.out.println(st1);
		
		System.out.println("===buffer===");	
		
		StringBuffer sb = new StringBuffer();
		
		String s2 = "��";
		sb.append(s2);
		sb.append("��");
		sb.append("��");
		sb.append("��");
		sb.append("��");
		System.out.println(sb);
		
		System.out.println("============");	
		
		System.out.println(sb.charAt(1));
	
		// String st3 = sb; >> stringbuffer �� string �� ���� �� ����.
		// �׷��� toString���� Ÿ���� �ٲ�����Ѵ�.
		String st3 = sb.toString();
		System.out.println(st3);
		
		
	}
}
