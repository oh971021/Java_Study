
public class OMain_2 {
	public static void main(String[] args) {
		
		// 삼성 ( Galaxy )
		
		// 1. '직접'접근 못하도록
		// 2. 제조사는 '상수'
		// 3. 상품정보 출력(공통)
		
		// 품명 : 갤럭시1, 가격 : 50, 제조사
		Galaxy G1 = new Galaxy("갤럭시1", 50);
		G1.Info();
		
		// 품명 : 갤럭시2, 가격 : 150, 제조사
		Galaxy G2 = new Galaxy("갤럭시2", 150);
		G2.Info();
		
		// 품명 : 갤럭시3, 가격 : 250, 제조사
		Galaxy G3 = new Galaxy("갤럭시3", 250);
		G3.Info();
		
		// ----------------------------------------- //
		
		// 갤럭시3 가격 조정 250 >> 180 수정
		G3.setPrice(180);
			// 갤럭시3 정보 출력
			G3.Info();
		// 현재 생산 된 갤럭시 휴대폰 대수
		System.out.println("현재 생상된 폰 총 대수 : " + Galaxy.getCount());
	}
}
