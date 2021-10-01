import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CMain_5 {
	public static void main(String[] args) {
		
		// Map �迭 : ����������, ���� �ý��� X, key-value ���� ���·� �̷����
		
		// <> �ȿ��� ������ Ÿ���� �ִ´�.
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// HashMap �� Set, Add ��� Put�� ����Ѵ�.
		hm.put("ź��ȭ��", 50);
		hm.put("�ܹ���", 500);
		hm.put("����", 5000);
		
		System.out.println(hm.get("�ܹ���"));
		
		System.out.println("===========");
		
		// ã�� �л� �̸��� ���� ������ �� �� �ֵ��� �Ѵ�.
		
		// �л��� �̸����� �����ؼ� ã�ڴٸ� HashMap�� ����
		// HashMap : Key������ �ε����� �����.
		
		// �л��� ��ȣ�� �����ؼ� ã�ڴٸ� Array�� ����
		// Array : Index�� ������ �־ ��ȣ�� ����.
		
		// �ַ� Array�� ��������� Ư���� ������ HashMap�� �����.
		// ArrayList �� ������ �ϱ⽺ ����!!
		
		HashMap<String, Student> students = new HashMap<String, Student>();
		
		students.put("�ؼ�", new Student("�ؼ�", 20, 10, 20, 30));
		students.put("��ȣ", new Student("��ȣ", 30, 30, 30, 30));
		
		// �̸��� Key�� �����ؼ� �˻��� �� ����.
		System.out.println(students.get("�ؼ�").getAge()); 
		
		// ���� ��°� ������ ���� �ִ����� �˰�ʹ�.
		Set<String> sName = students.keySet();
		ArrayList<String> sName_ = new ArrayList<String>(sName);
		
		for (String s : sName_) {
			System.out.println(s);
		}
		
		Scanner k = new Scanner(System.in);
		System.out.print("���� : ");
		String name = k.next();
		
		System.out.println(students.get(name)); // �Է��� ��� (��ü�ּ�)
		students.get(name).info();
		
	}
}
