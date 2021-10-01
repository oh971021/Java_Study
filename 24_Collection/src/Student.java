public class Student {
	private String name;
	private int age;
	private int eng;
	private int kor;
	private int jps;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int eng, int kor, int jps) {
		super();
		this.name = name;
		this.age = age;
		this.eng = eng;
		this.kor = kor;
		this.jps = jps;
	}

	public String getName() {	return name;	}

	public void setName(String name) {	this.name = name;	}

	public int getAge() {	return age;	}

	public void setAge(int age) {	this.age = age;	}

	public int getEng() {	return eng;	}

	public void setEng(int eng) {	this.eng = eng;	}

	public int getKor() {	return kor;	}

	public void setKor(int kor) {	this.kor = kor;	}

	public int getJps() {	return jps;	}

	public void setJps(int jps) {	this.jps = jps;	}
	
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("영어 성적 : " + eng);
		System.out.println("국어 성적 : " + kor);
		System.out.println("일어 성적 : " + jps);
	}
	
}
