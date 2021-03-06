public class IAMain_2 {
	public static void main(String[] args) {
		
		// ###### 조건 ####### 
		// 1. 필드 '직접' x ( 필드 값 모조리 private 붙히기 )
		// 2. 나중에 값 o, 생성 때 o ( 게터랑 세터 만들고, 오버로딩 생성자 만들기 )
		
		System.out.println("============================");
		
		// 컴퓨터 ( 품명, 가격 ) 정의 및 값 재정의
		Computer myCom = new Computer("Dell", 2500000, 2.5, 16, 500);
		myCom.setName("아이맥");
		myCom.setPrice(1500000);
			// cpu, ram, hdd 값 재정의
			myCom.setCPU(1.5);
			myCom.setRAM(8);
			myCom.setHDD(256);
	
		// 정보 출력
		myCom.info();
		
		System.out.println("============================");
		
		// 볼펜 ( 품명, 가격, 색깔 ) 정의 및 값 재정의
		Pen myPen = new Pen("빨간펜", 500, "빨강");
		myPen.setName("모나미");
		myPen.setPrice(1000);
		myPen.setColor("파랑");
		// 정보 출력
		myPen.info();
		
		System.out.println("============================");
		
		// 노트북 ( 품명, 가격, 무게) 정의 및 값 재정의
		Notebook myNote = new Notebook("갤럭시북", 1500000, 100, 255);
		myNote.setName("맥북");
		myNote.setPrice(2000000);
			// 배터리, 용량 값 재정의
			myNote.setBattery(90);
			myNote.setVolume(500);
		// 정보 출력
		myNote.info();
		
		System.out.println("============================");
		
	}
}
