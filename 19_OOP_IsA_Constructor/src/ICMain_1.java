
public class ICMain_1 {
	public static void main(String[] args) {

		// 조건
		// 1. 인스턴스 생성시 값 넣어서 생성
		// 2. 모든 필드는 직접접근 할 수 없도록 한다.
		
		// 스포츠카
		Car sportCar = new Car("부가티", "321가 5959");
			// 모델명, 넘버 > 정보출력
			sportCar.info();
		
		// 택시
		Taxi taxi = new Taxi("쏘나타", "59아 3535", 3300);
			// 모델명, 넘버, 기본료 > 정보출력
			taxi.info();
		
		// 버스
		Bus bus = new Bus("카운티", "35저 1515", 909);
			// 모델명, 넘버, 노선번호 > 정보출력
			bus.info();
		
	
		
		
	}
}
