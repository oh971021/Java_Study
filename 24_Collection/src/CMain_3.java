import java.util.ArrayList;
import java.util.Comparator;

public class CMain_3 {
	public static void main(String[] args) {
		
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student("홍준영", 20, 80, 70, 60);
		students.add(s1);
		
		students.add(new Student("김관동", 23, 90, 96, 95));
		students.add(new Student("성기훈", 20, 60, 76, 65));
		students.add(new Student("배준원", 20, 40, 53, 75));
		students.add(new Student("노솔리", 21, 75, 86, 85));
		students.add(new Student("오준석", 25, 100, 100, 100));
		students.add(new Student("손동찬", 21, 59, 65, 75));
		
		// 학생 수
		System.out.println(students.size());
		
		// 두번째 학생의 국어 점수
		System.out.println(students.get(2-1).getKor());
		
		// 세번째 학생의 이름
		System.out.println(students.get(3-1).getName());
		
		// 일곱번째 학생의 일본어 점수
		System.out.println(students.get(7-1).getJps());
		
		// 다섯번째 학생의 이름과 나이
		System.out.println(students.get(5-1).getName()+"이고, "+students.get(4).getAge()+"살");
		
		// 다섯번째 학생의 영, 국, 일 평균 점수
		double avg = 0;
		avg += ((students.get(5-1).getEng() + students.get(5-1).getJps() + students.get(5-1).getKor()) / 3);
		
		System.out.println(avg);
		
		System.out.println("===================");
		
		// 이름 가나다 순 정렬
		// 정렬하는 기능 : Comparator (인터페이스)
		Comparator<Student> c = new Comparator<Student>() {
			
			// 익명 객체로 일회성의 성질
			// 정렬만하고 안쓰기 때문에 일회용 사용
			@Override
			public int compare(Student o1, Student o2) {
				String o1Name = o1.getName();
				String o2Name = o2.getName();
				
				return o1Name.compareTo(o2Name);
			}
		};
		
		// 정렬하는 Comparator 로 객체를 만들어주고,
		// 그 정렬 된 객체를 sort로 가지고와서 순서대로 정렬해준다.
		students.sort(c);
		
		for (Student s : students) {
			s.info();
			System.out.println("=============");
		}
		
		System.out.println();
		System.out.println("##################################");
		System.out.println();
		
		// 나이순 정렬 (역순)
		
		// 리스트에서 사용했던 것 처럼
		// 여기서도 기본형 타입을 참조형 타입으로 변경해야 사용 가능하다.
		Comparator<Student> d = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Integer o1Age = o1.getAge();
				Integer o2Age = o2.getAge();
				
				return o1Age.compareTo(o2Age);
			}
		};
		
		// 역순으로 하고싶을 때
		students.sort(d.reversed());
		
		for (Student s : students) {
			s.info();
			System.out.println("=============");
		}
		
		System.out.println();
		System.out.println("##################################");
		System.out.println();
		
		// 종합 성적 순
		Comparator<Student> e = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Double o1Avg = (o1.getEng() + o1.getJps() + o1.getKor() / 3.0 ); 
				Double o2Avg = (o2.getEng() + o2.getJps() + o2.getKor() / 3.0 ); 
				
				return o2Avg.compareTo(o1Avg);
			}
		};
		
		students.add(new Student("꼴찌는 내꺼다", 20, 100, 100, 100));
		
		students.sort(e);
		
		for (Student s : students) {
			s.info();
			System.out.println("=============");
		}
		
		System.out.println();
		System.out.println("##################################");
		System.out.println();
		
		// 1등 학생의 전체 정보 출력
		System.out.println("= 1등 학생의 정보 =");
		students.get(0).info();
		
		System.out.println();
		
		System.out.println("= 꼴등 학생의 정보 =");
		
		students.get(students.size() - 1).info();
		
	}
}
