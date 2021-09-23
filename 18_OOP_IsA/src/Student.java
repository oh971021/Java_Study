
// student is a human (o)
// human is a student (x)

// Person : 상위(super) 클래스
// Student : 하위(sub) 클래스

// 위 관계가 성립하는 것을 'Is A' 라고 한다 (상속관계)

public class Student extends Person {
	// Person에 있는 필드 값, 메소드 전부 사용 가능하다.
	
	// 이름, 나이, 일어 점수
	private int jpscore;
	
	public Student() {}
	
	public Student(int jpscore) {
		super();
		this.jpscore = jpscore;
	}
	
	public int getJpscore() {
		return jpscore;
	}

	public void setJpscore(int jpscore) {
		this.jpscore = jpscore;
	}

	// 물려 받는 메소드가 기능이 부족할 때,
	// 오버라이딩으로 메소드를 재정의 해준다.
	// 오버로딩과 헷갈리지 말자~

	// 자기소개
	@Override
	public void info() {
		// super : 상위클래스 (부모클래스) 를 뜻함.
		super.info();
		System.out.println("일어 점수는 "+jpscore+"점 입니다.");
	}
}