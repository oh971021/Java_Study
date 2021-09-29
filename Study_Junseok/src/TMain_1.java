public class TMain_1 {
	public static void main(String[] args) {
		int result = sum(1,2,3,4,5,6,7,8,8);
		
		System.out.println(result);
	}
	
	public static int sum(int ... values) {
		int sum = 0;
		
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}
