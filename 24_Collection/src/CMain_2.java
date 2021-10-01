import java.util.ArrayList;
import java.util.Iterator;

public class CMain_2 {
	public static void main(String[] args) {
		
		/*
		Car[] car1 x 50000
					+++ �߰�����
		*/
		
		// List �迭 : ���� ������ �迭		
		ArrayList al = new ArrayList();
		
		al.add(1);
		al.add(2.1);
		al.add("3");	// �ڷ��� ���� ���� �͵� ���� ( �� �Ⱦ� )
		
		// �迭���� length �� ����� Ȯ��������
		// ����Ʈ������ size �� ����� Ȯ���Ѵ�.
		System.out.println(al.size());
		
		System.out.println("===================");
	
		// <Ŭ������> : Generic -> ����Ʈ�� ������ Ÿ���� �����ִ� ��.
		// �Ʒ��� ����Ʈ�� String�� Generic���� �����Ǿ��־�, �ٸ� Ÿ���� ���� �� ����.
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Hello");
		al2.add("Java");
		al2.add("Array");
		
		System.out.println(al2.size());
						// al2.length -> al2.size ( ����Ʈ������ ���� )
		System.out.println(al2.remove(2));
		System.out.println(al2);
		System.out.println(al2.add("Array"));
		
		// �迭�� ���� foreach��
		for (String s : al2) {
			System.out.println(s);			
		}
		
		// ������ ������� ��� �߰� �����ϴ�.
		al2.add("Start");
		al2.add(0, "Eclipse");
		
		// Index�� ���� �� ���õ� ����
		al2.set(2, "JAVA");
		
		// Index�� ���� �� ������ ����
		al2.remove(4);
		
		System.out.println("===================");
		
		// �迭�� ģ�� for��
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		
		System.out.println("===================");
		
		// al3�� ���� 10, 20�� �ְ� �� ���
		// �� �Ⱦ��� ���� X > Generic�� �Ἥ Ÿ������ �������ֱ�
		
		// Generic �ȿ��� �⺻���� ���� �� ����.
		// �⺻ �ڷ����� ������?? ���� �ۼ����ָ� �ȴ�.
		// �� �ڷ����� ����Ÿ���� ã�´�.
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		
		al3.add(10);
		al3.add(20);
		
		for (Integer s : al3) {
			System.out.println(s);
		}
		
		System.out.println("===================");
		
		
		
		
	}
}
