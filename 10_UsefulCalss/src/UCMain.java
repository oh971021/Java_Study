import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		
		String s = "�ȳ�";
		String ss = new String("�Ϳ� �� ����");
		//new ���� �Ÿ𸮿� ������ �����ϰ� ���ִ� ��
		//new�� ���������� ���� ����� ���ÿ� �ּҰ� ���ܼ� ã�ư�
		

		//�̲��� �ּҰ��� ���ϴ°� �ƴϰ� ��Ʈ����ü�� ��
		System.out.println(s.equals(ss));

		// ss�� ����° ���� ���
		System.out.println(ss.charAt(2));
		
		// ss�� ��ü ���� �� ���
		System.out.println(ss.length());
		
		System.out.println("------------------");

	   // ss���� '��' �̶�� ���ڰ� �� ��°�� �ִ°�
        System.out.println(ss.indexOf("��"));
     // ss�� '��' �� �����ϴ°�?
        System.out.println(ss.startsWith("��"));
     // ss�� '��' ���� �����°�?
        System.out.println(ss.endsWith("��"));
     // ss�� '��' ���� �����°�?
        System.out.println(ss.endsWith("��"));
        
     // ss�� '��'�� '����'�� �ٲٱ�
       String c = ss.replace("��", "����");
    		   System.out.println(c);
     // ss�� 2~4��° ���� ���� ��� (�� ��)
        System.out.println(c.substring(1,4));
        
        System.out.println("---------------------------");
        
        String sss = "���,����,�ٳ���";
        
        //���ڿ� �и� 
        String[] sss2 = sss.split(",");
        for (String sss3 : sss2) {
			System.out.println(sss3);
		}
        		
        System.out.println("---------------------------");
        
        StringTokenizer st = new StringTokenizer(sss,",");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        
        System.out.println("---------------------------");
        
        StringTokenizer st2 = new StringTokenizer(sss,",");
        
        while(st2.hasMoreTokens()) {
        	System.out.println(st2.nextToken());
        }
        
        System.out.println("---------------------------");
        //���������. ��� heap������ ���ο� string�� ����
        String s1 = "��";
         s1+="��";
         s1+="��";
         s1+="��";
         s1+="��";
         System.out.println(s1);
         //�������. ���� ������ ���ڿ� ��ä
         StringBuffer sb = new StringBuffer();
          String s2 = "��";
          sb.append(s2);
          sb.append("��");
          sb.append("��");
          sb.append("��");
          sb.append("��");
         System.out.println(sb);
         
         String s3 = sb.toString();
         System.out.println(sb.charAt(1));
         System.out.println(s3);
        
        
	}
}
