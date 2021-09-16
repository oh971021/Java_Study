public class Main_1 {
	public static void main(String[] args) {
		// 상속 예시 만들어보기
		// 사람이라는 속성을 상속받은
		// 일반고객을 만들고, 등급별로 나누기
		
		Customer junseok = new Customer();
		junseok.name = "오준석";
		junseok.age = 25;
		junseok.grade = 5;
		
		junseok.personInfo();
		junseok.customerInfo();
	}
}

class Person {
	String name;
	int age;
	
	void personInfo() {
		System.out.println("이름 : "+name+", 나이 : "+age);
	}
}

class Customer extends Person {
	int grade;
		
	void customerInfo() {
		if (grade > 4) {
			System.out.println("이름 : "+name+", 나이 : "+age+", 등급 : "+grade+" { 고객님의 등급은 VIP입니다. }");
		} else {
			System.out.println("이름 : "+name+", 나이 : "+age+", 등급 : "+grade+" { 고객님의 등급은 일반입니다. }");
		}
	}
}