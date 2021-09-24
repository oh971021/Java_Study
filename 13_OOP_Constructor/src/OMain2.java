
public class OMain2 {
	public static void main(String[] args) {
		
		//프로그래머
		
		//오버로딩 생성자로, 외부에서 직접 접근 못하게
		//이름
		//나이
		//야근 : true
		
		//p1.work() ->콘솔에 아무것도안낭옴
		//p1.work("일")		//코딩하기
		//p2.work("퇴근")		//감사요
		
		//기능
			//일
		
		Programer p1 = new Programer("솔리", 27, true);
		
		p1.Work();
		p1.Work("일");
		p1.Work("퇴근");
		
		
		
	}
}
