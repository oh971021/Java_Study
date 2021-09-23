public class IAMain_1 {
	public static void main(String[] args) {
		// 사람 = 이름, 나이, 자기소개
		// 준석, 25, 자기소개
		
		Person p = new Person("준석", 25);
		
		p.info();
		
		System.out.println("===============================");
		
		// 학생 = 이름, 나이, 일본어 점수
		// 자기소개 기능 있음
				// 준발, 26, 99
		
		Student s = new Student(99);
		s.setName("준발");
		s.setAge(26);
		
		s.info();
		
		System.out.println("===============================");
		
		// 선생 = 이름, 나이, 담당과목
		// 자기소개 기능 있음
				// mz, 27, java
		
		Teacher t = new Teacher("JAVA");
		t.setName("민재");
		t.setAge(27);
		
		t.info();
		
		System.out.println("===============================");
	}
}
