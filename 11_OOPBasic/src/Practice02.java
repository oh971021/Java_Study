public class Practice02 {
	public static void main(String[] args) {
		// 필드에 직접 접근하지 못하게 막아주세요
		
		Animal02 dog = new Animal02();
		dog.setKinds("강아지");
		dog.setAge(8);
		
		Animal02 dog2 = new Animal02();
		dog2.setKinds("멍멍이");
		dog2.setAge(7);
		
		Animal02 cat = new Animal02();
		cat.setKinds("고양이");
		cat.setAge(13);
		
		dog.Move();
		dog2.Move();
		cat.Move();
		
		System.out.printf("%s는 %d개월 입니다.\n", dog.getKinds(), dog.getAge());
		System.out.printf("%s는 %d개월 입니다.\n", dog2.getKinds(), dog2.getAge());
		System.out.printf("%s는 %d개월 입니다.\n", cat.getKinds(), cat.getAge());
	}
}

class Animal02 {
	private String kinds;
	private int age;
	
	void Move() {
		System.out.println(kinds+"가 움직입니다.");
	}	
	
	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 100) {
			this.age = 100;	
		} else {
			this.age = age;
		}
	}
}
