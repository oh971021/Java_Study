public class TCMain {
	public static void main(String[] args) {
		double a = 10 / 4;
		System.out.println(a);
		
		// 21억 .. long 은 int 보다 큰 그릇
		
		int aa = 10;
		long bb = aa;
		System.out.println(bb);
		
		int cc = (int) bb; // miss match (int 는 long 보다 작은 크릇)
		
		double dd = cc; // 이건 되네?
		dd = 10.5;
		System.out.println(dd);
		
		int ee = (int) dd; // double -> int
		System.out.println(ee);
		// 형 변환을 해줘야함.
		// 데이터 유실이 있을 수 있다.
		
	}
}
