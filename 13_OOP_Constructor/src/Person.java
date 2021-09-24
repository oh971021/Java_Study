
public class Person {
	String name;
	String gender;
	
	//기본 생성자 : 생성자를 전혀 안건드리면 자동으로 만들어줌
	//			오버로딩 생성자를 만들었따면 자동으로 만들어줌
	//안보여도 있는거. 근데 '응애' 넣어야 되닌깐 가시화 시킨거
	public  Person() {
		// 주의사항 : Spring..등 ..자바 객체를 자동으로 만들어주는 등의 일을 할 때 기본생성자를 사용
		//그래서 이 기본생성자를 빼면 에러. java상의 문제는 없지만
		//다른 프로그램 해주는? 이유들 때문에 그냥 만드는걸 습관화
		System.out.println("응애");
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("응애");
	}
	
	
}
