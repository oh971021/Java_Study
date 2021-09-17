public class Person {
	private String name;
	private String gender;
	
	// 기본 생성자 : 생성자를 전혀 건드리지 않으면 자동으로 만들어 줌.
	// 			  오버로딩 생성자를 만들었다면 자동으로 만들어지지 않음.
	public Person() { // '가시화' 시킨 생성자
	// 주의사항 : Spring .. 등 자바 객체를 자동으로 만들어 주는 등의 일을 할 때 기본 생성자를 사용
	//			그래서 이 기본 생성자를 빼면 에러가 발생한다. Java 상의 문제는 없지만
	//			다른 프로그램이 도와줄 때 문제가 생길 수 있기 때문에
	//			생성자를 만드는 것을 습관화하는 것이 좋다.
		System.out.println("응애");
	}

	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		System.out.println("응애");
	}
}
