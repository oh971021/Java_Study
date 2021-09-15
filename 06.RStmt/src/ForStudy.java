import java.security.SecurityPermission;

public class ForStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println();
//			for (int j = 0; j < 5; j++) {
//				if (i == j) {
//					System.out.print("z\n");
//				}
//				System.out.print(" ");
//			}
//		}
		
//		for (int i =0; i < 5; i++) {
//			for (int j = 2; j <= i; j += 2) {
//				System.out.print("z");
//				System.out.print(" ");
//			}
//			System.out.print("z");
//			System.out.println();
//		}
//		
		System.out.print("----------------");
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print("z");
				} else if (j % 2 == 0) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------------");	

		for (int i=0; i<5; i++) {
			for (int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<2*i+1; j++) {
				System.out.print("z");
			}
			System.out.println();
		}
		
		
		System.out.print("----------------");
		
		for (double i = 0; i <= 2; i+=0.5) {			
			for (int j = 0; j <= i; j++) {
				System.out.print("z ");
			}
			System.out.println();
		}

		
		
	}
}
