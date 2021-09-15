public class Prectice_Day {
	public static void main(String[] args) {
		
		for (int day = 1; day < 32; day++) {
			for (int month = 1; month < 13; month++) {
				if ((month == 2 && day > 28) || ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
					System.out.print("\t\t|");
					continue;
				}
				System.out.printf("    %d¿ù %dÀÏ \t|", month, day);
			}
			System.out.println();
		}
		
	}
}
