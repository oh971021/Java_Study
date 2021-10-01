import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class CMain_4 {
	public static void main(String[] args) {
		
		// List �Ʒ� Array �� ������.
		
		// Set �迭 : ����������, �ߺ������� ó��(�ڵ�����), ���� ������ġ
		// HashSet�� �� �Ⱦ�.
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(10);
		hs.add(20);
		hs.add(30);

		// ����Ϸ��� Set -> List�� �����ؼ� ���
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		
		System.out.println(hs.size());
		for (Integer i : hs) {
			System.out.println(i);
		}
		
		System.out.println(al.get(0));
		
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("�ؼ�", 25, 20, 10, 80));
		students.add(new Student("�ָ�", 28, 40, 52, 92));
		students.add(new Student("�ָ�", 28, 40, 52, 92));
		// �����ʹ� ������ ���� �ι�° �ָ��� ����° �ָ��� �ٸ� ����̴�.
		
		System.out.println(students.size());
		
		Student s = new Student("����", 20, 30, 40, 50);
		students.add(s);
		students.add(s);
		students.add(s);
		// �ϳ��� ��ü s�� ������ �����Ŷ� �ߺ������ͷ� ó����
		
		System.out.println(students.size());
		
		// �ζ�
		Random r = new Random();
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (true) {
			lotto.add(r.nextInt(45)+1);
			
			if (lotto.size() == 6) {
				break;
			}
		}
		
		System.out.println(lotto);
		
		// ������ �ٲ㼭 ���
		ArrayList<Integer> lotto2 = new ArrayList<Integer>(lotto);
		for (Integer i : lotto2) {
			System.out.print(i+" ");
		}
		
	}
}
