public class OMain_3 {
	public static void main(String[] args) {
		// 사람
		// 속성 : 이름, 나이
		// 자기소개 기능
		
		// 준석, 25살 자기소개
		Person Junseok = new Person();
		Junseok.name = "오준석";
		Junseok.age = 25;
		Junseok.Introduce();
		
		System.out.println("=====================");
		
		Person Solri = new Person();
		Solri.name = "노솔리";
		Solri.age = 28;
		Solri.Introduce();
		
		System.out.println("=====================");
		
		System.out.println(Junseok);
		System.out.println(Solri);
		Person Junseok2 = Junseok;
		System.out.println(Junseok2);
		
		System.out.println("=====================");
		
		Junseok2.name = "준석";
		Junseok.Introduce();
		Junseok2.Introduce();

		System.out.println("=====================");
		
		// null 을 대입시켜주면 참조형 변수가 가지고 있는 번지값을 지워준다.
		Junseok2 = null;
		System.out.println(Junseok2);
		
		Junseok = null; // 위처럼 참조하고 있는 변수 모두를 지워주면 GC가 발동한다.

		// Garbage Collector :  Heap 영역의 메모리를 자동으로 정리해준다.
		// 더 이상 그 번지를 가리키는 변수가 없을 때 발동된다.
	}
}
