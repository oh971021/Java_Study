import java.util.Random;

// 고양이가 냥냥펀치를 때리면 주인은 아파한다..
public class OSub_1 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.CatInfo("야옹이", 5);
		
		System.out.print("냥냥펀치 발사 ");
		cat.Nyangnyang_Punch();
		
		// 맞는 기능은 랜덤으로 0과 1을 만든다.
		Random r = new Random();
		int punch = r.nextInt(2);
		
		// 냥냥펀치를 맞으면 "아야"
		// 피하면 "오예"
		if (punch == 1) {
			System.out.println("피했지롱");
		} else {
			System.out.println("아야...");
		}
		
	}
}
