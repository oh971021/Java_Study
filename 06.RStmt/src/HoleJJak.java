import java.util.Random;
import java.util.Scanner;

public class HoleJJak {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		while (true) {

			int comNum = r.nextInt(2)+1;

			System.out.println("1: Ȧ/ 2: ¦");
			int myAns = s.nextInt();

			if (comNum % 2 == 0 && myAns % 2 == 0) {
				System.out.println("����");
				break;
			} else if (comNum % 2 == 1 && myAns % 2 == 1) {
				System.out.println("����");
				break;
			} else {
				System.out.println("��");
			}
		}
	}
}
