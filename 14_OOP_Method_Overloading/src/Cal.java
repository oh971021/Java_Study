// Over loading

// �޼ҵ� �̸��� ������, �Ķ����(Ÿ��, ����)�� �ٸ���
public class Cal {
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d);
	}
	
	public static void add(double a, double b) {
		System.out.println(a + b);
	}
	
	public static void add(double a, double b, double c) {
		System.out.println(a + b + c);
	}

	public static void add_free(int... a) {
		// System.out.println(a);
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count += a[i];
		}
		System.out.println("���� : "+count);
	}
	
	public static void mul_free(int... a) {
		// System.out.println(a);
		
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				count += a[i];
			} else {
				count *= a[i];
			}
		}
		System.out.println("���� : "+count);
	}
}
