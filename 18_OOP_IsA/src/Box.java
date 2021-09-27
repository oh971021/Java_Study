import java.util.Random;

// 짝수의 랜덤숫자를 뽑아주는 박스

// 랜덤클래스를 상속받은 박스클래스에서는 랜덤클래스의 속성과 기능을 모두 사용할 수 있다.
public class Box extends Random {
	
	// 오버라이딩(재정의)도 가능하다.	
	@Override
	public int nextInt(int value) {
		int temp = super.nextInt(value);
		if (temp % 2 == 0) {
			return temp;
		}
		
		// 재귀호출
		return nextInt(value);
	}
}
