public class Practice01 {
	public static void main(String[] args) {
		/*
		 * 강아지가 움직입니다.
		 * 고양이가 움직입니다.
		 * 강아지는 8개월
		 * 고양이는 13개월
		 */
		
		Animal dog = new Animal();
		dog.kinds = "강아지";
		dog.age = 8;
		
		Animal cat = new Animal();
		cat.kinds = "고양이";
		cat.age = 13;
		
		dog.Move();
		cat.Move();
		dog.Info();
		cat.Info();
	}
}

class Animal {
	String kinds;
	int age;
	
	// println 이나 printf 뭐든 상관없다.
	void Move() {
		System.out.println(kinds+"가 움직입니다.");
	}
	
	void Info() {
		System.out.printf("%s는 %d개월\n", kinds, age);
	}
}
