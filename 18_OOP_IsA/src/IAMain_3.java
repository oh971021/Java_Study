import java.util.Random;

public class IAMain_3 {
	public static void main(String[] args) {
		
		// ·£´ý ¼ýÀÚ¸¦ »ÌÀ½ (Â¦¼ö¸¸)
		Random r = new Random();	// ·£´ý °´Ã¼ »ý¼º
		int num = r.nextInt(5)+1;
		if(num % 2 == 0) {
			System.out.println(num);
		}
		
		System.out.println("=================");
		
		// Â¦¼ö¸¸ ·£´ýÀ¸·Î »Ì¾ÆÁÖ´Â ¹Ú½º¸¦ »ý¼º
		Box b = new Box();
		System.out.println(b.nextInt(3));
	}
}
