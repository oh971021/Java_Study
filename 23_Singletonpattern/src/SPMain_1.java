
public class SPMain_1 {
	public static void main(String[] args) {
		
		// 자기자신 : 이름, 나이
		Me.getMe().info();
		Me me = Me.getMe();
		me.info();
		System.out.println(me);
		
		Me me2 = Me.getMe();
		me.info();
		System.out.println(me2);
		
		System.out.println("=============");
		
		// 아이언맨 : 이름, 나이 -> 정보출력
		IronMan tony = IronMan.getTony();
		tony.info();
		
	}
}
