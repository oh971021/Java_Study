import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class RSMain4 {
	public static void main(String[] args) {

		/*
		// 1+2+3 ... +10 = 55
		int count = 0;
		
		for (int i=1; i<10+1; i++) {
			count += i;
		}
		System.out.println(count);
		*/
		
		// for (반복횟수)
		// while (반복조건)
		
		// 1+2+3... 몇까지 더해야 1000이 넘나요?
		
//		int count = 0;
//		int i = 1;
		
		// 먼저 몇까지 더해야 10이 넘나?
		
//		while (count < 10) {
//			count += i;
//			i++;
//		}
//		System.out.println(count);
//		System.out.println(i-1);

		// 몇까지 더해야 50이 넘나요?
		
//		while (count < 50) {
//			count += i;
//			i++;
//		}
//		System.out.println(count);
//		System.out.println(i-1); // 하나가 더해진 상태로 빠져나와서 -1을 해줘야함.
		
		// 몇까지 더해야 1000이 넘나요?
		
//		while (count < 1000) {
//			count += i;
//			i++; // 증감식을 변수에 ++ 해서 사용해준다.
//		}
//		System.out.println(count);
//		System.out.println(i-1);
		
		// 스캐너 이용해서 원하는 값을 구하기
		
		Scanner k = new Scanner(System.in);
		
		// 입력 - 0을 넣으면 stop 되게 만든다.
		
		int c = 1;
		
//		while (c != 0) {
//			System.out.println("f : ");
//			c = k.nextInt();
//		}
		
//		while (true) {
//			System.out.println("c : ");
//			c = k.nextInt();
//			if (c == 0) {
//				break;
//			}
//		}

//		int aaa = 0;
//		
//		while (true) {
//			System.out.println(aaa);
//			if (aaa == 10) {
//				break;
//			}
//			aaa++;
//		}
		
		// do - while 문
		// 조건 여부와 상관없이 한번은 무조건 실행 보장
		
		int kk = 0;
		int ll = 0;
		
		do {
			kk += 2;
			ll++;
		} while (kk < -100);
		
		System.out.println(kk);
		System.out.println(ll);
	}
}
