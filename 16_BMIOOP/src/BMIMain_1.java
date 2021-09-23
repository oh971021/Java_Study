public class BMIMain_1 {
	public static void main(String[] args) {
		
		// 객체지향 설계 (현실을 반영하겠다)
		
		// 의사, 기계
		Doctor d = new Doctor();
		
		// 손님
		Guest g = new Guest();
		
		// 의사와 손님의 상호 행동
		
		// 1. 의사가 손님의 정보를 물어본다.
		d.act1(g);
		
	}
}
