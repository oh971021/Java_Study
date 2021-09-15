public class AMain_4 {
	public static void main(String[] args) {
		
		int aa[] = {100, 200, 300, 400};
		int bb[] = new int[] {100, 200, 300};
		
		int cc[];
		cc = new int[] {100, 200};
		
		int dd[] = new int[1];
		dd[0] = 100;
		
		// 결과 출력
		// aa[0] = 100;
		// aa[1] = 200;
		// aa[2] = 300;
		// aa[3] = 400;
		// aa[4] = 500;
		
	    int count = 0;
		for (int i : aa) {
			System.out.printf("aa[%d] = %d\t", count, i);
			count++;
		}
		count = 0;
		System.out.println();
		for (int i : bb) {
			System.out.printf("bb[%d] = %d\t", count, i);
			count++;
		}
		count = 0;
		System.out.println();
		for (int i : cc) {
			System.out.printf("cc[%d] = %d\t", count, i);
			count++;
		}
		count = 0;
		System.out.println();
		for (int i : dd) {
			System.out.printf("dd[%d] = %d\t", count, i);
			count++;
		}
		
	}
}
