import java.util.ArrayList;
import java.util.Comparator;

public class CMain_3 {
	public static void main(String[] args) {
		
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student("ȫ�ؿ�", 20, 80, 70, 60);
		students.add(s1);
		
		students.add(new Student("�����", 23, 90, 96, 95));
		students.add(new Student("������", 20, 60, 76, 65));
		students.add(new Student("���ؿ�", 20, 40, 53, 75));
		students.add(new Student("��ָ�", 21, 75, 86, 85));
		students.add(new Student("���ؼ�", 25, 100, 100, 100));
		students.add(new Student("�յ���", 21, 59, 65, 75));
		
		// �л� ��
		System.out.println(students.size());
		
		// �ι�° �л��� ���� ����
		System.out.println(students.get(2-1).getKor());
		
		// ����° �л��� �̸�
		System.out.println(students.get(3-1).getName());
		
		// �ϰ���° �л��� �Ϻ��� ����
		System.out.println(students.get(7-1).getJps());
		
		// �ټ���° �л��� �̸��� ����
		System.out.println(students.get(5-1).getName()+"�̰�, "+students.get(4).getAge()+"��");
		
		// �ټ���° �л��� ��, ��, �� ��� ����
		double avg = 0;
		avg += ((students.get(5-1).getEng() + students.get(5-1).getJps() + students.get(5-1).getKor()) / 3);
		
		System.out.println(avg);
		
		System.out.println("===================");
		
		// �̸� ������ �� ����
		// �����ϴ� ��� : Comparator (�������̽�)
		Comparator<Student> c = new Comparator<Student>() {
			
			// �͸� ��ü�� ��ȸ���� ����
			// ���ĸ��ϰ� �Ⱦ��� ������ ��ȸ�� ���
			@Override
			public int compare(Student o1, Student o2) {
				String o1Name = o1.getName();
				String o2Name = o2.getName();
				
				return o1Name.compareTo(o2Name);
			}
		};
		
		// �����ϴ� Comparator �� ��ü�� ������ְ�,
		// �� ���� �� ��ü�� sort�� ������ͼ� ������� �������ش�.
		students.sort(c);
		
		for (Student s : students) {
			s.info();
			System.out.println("=============");
		}
		
		System.out.println();
		System.out.println("##################################");
		System.out.println();
		
		// ���̼� ���� (����)
		
		// ����Ʈ���� ����ߴ� �� ó��
		// ���⼭�� �⺻�� Ÿ���� ������ Ÿ������ �����ؾ� ��� �����ϴ�.
		Comparator<Student> d = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				
				return o1Age.compareTo(o2Age);
			}
		};
		
		// �������� �ϰ���� ��
		students.sort(d.reversed());
		
		for (Student s : students) {
			s.info();
			System.out.println("=============");
		}
		
		System.out.println();
		System.out.println("##################################");
		System.out.println();
		
		// ���� ���� ��
		Comparator<Student> e = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Double o1Avg = (o1.getEng() + o1.getJps() + o1.getKor() / 3.0 ); 
				Double o2Avg = (o2.getEng() + o2.getJps() + o2.getKor() / 3.0 ); 
				
				return o2Avg.compareTo(o1Avg);
			}
		};
		
		students.add(new Student("����� ������", 20, 100, 100, 100));
		
		students.sort(e);
		
		for (Student s : students) {
			s.info();
			System.out.println("=============");
		}
		
		System.out.println();
		System.out.println("##################################");
		System.out.println();
		
		// 1�� �л��� ��ü ���� ���
		System.out.println("= 1�� �л��� ���� =");
		students.get(0).info();
		
		System.out.println();
		
		System.out.println("= �õ� �л��� ���� =");
		
		students.get(students.size() - 1).info();
		
	}
}
