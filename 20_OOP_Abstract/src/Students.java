public abstract class Students {
	private String name;
	private int age;
	
	public Students() {}
	
	protected Students(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 추상 메소드(입실체크) 생성
	abstract void Ssig();
	
	// 추상 메소드(퇴실체크) 생성
	abstract void Fsig();
	
	// 기본 정보 출력 메소드 생성
	void info() {
		System.out.println(name+"의 나이는 "+age+"살");
	}
}

// 학생 중 한명인 짱구 생성
class JG extends Students {
	
	public JG() { super(); }
	
	public JG(String name, int age) { super(name, age); }

	// 추상 클래스를 구현한다
	@Override
	void Ssig() { System.out.println("입실 완료"); }
	
	// 추상 클래스를 구현한다.
	@Override
	void Fsig() { System.out.println("퇴실 완료"); }
}