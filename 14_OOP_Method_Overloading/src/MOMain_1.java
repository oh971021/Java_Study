public class MOMain_1 {
	public static void main(String[] args) {
		
		// Cal 에다가 기능을 정의해놓는다. : 계산하는 클래스
		Cal c = new Cal();
		// 정수 두 개를 넣으면 합을 출력 해주는 기능
		c.add(10, 20);
		
		// static을 썼을 때 접근하는 방법
		Cal.add(10, 20);
		
		System.out.println("================");
		// 정수 세 개를 넣으면 합을 출력 해주는 기능
		System.out.print("정수 세 개 : ");
		Cal.add(10, 20, 30);
	
		// 정수 네 개를 넣으면 합을 출력 해주는 기능
		System.out.print("정수 네 개 : ");
		Cal.add(10, 20, 30, 40);
		
		// 실수 두 개를 넣으면 합을 출력 해주는 기능
		System.out.print("실수 두 개 : ");
		Cal.add(10.1, 20.2);
		
		// 실수 세 개를 넣으면 합을 출력 해주는 기능
		System.out.print("실수 세 개 : ");
		Cal.add(10.1, 20.2, 30.3);
		
		Cal.add_free(1,2,3,4,5,5,6,7,7,1,2,3,4,5,1,2,3,1,2,3,2,12,3,2,4,12,5,23,1,35,1,23,21,312);
		
		// 정수를 몇개 넣든 다 곱해주는 메소드
		Cal.mul_free(1,2,3,4,5);
	}
}
