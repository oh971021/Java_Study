import java.util.Arrays;
import java.util.Iterator;

public class Amain_2 {
	public static void main(String[] args) {
		
		// �л��� �Ͼ������� 90��
		
		int JPscore = 90;
		System.out.println(JPscore);
	
		// �迭 ( Reference type )
		
		// �л� 5���� ��������
		int engScore[] = new int[5]; // 5ĭ ���� ���� [0:4]
		System.out.println(engScore);
		
		engScore[0] = 100;
		engScore[1] = 90;
		engScore[2] = 80;
		engScore[3] = 70;
		engScore[4] = 60;
		
		System.out.println("4��° �л��� ���� : " + engScore[3]);
		
		System.out.println("=============================");
		
		// ���� �˰� ���� �� (���� ����, �ʱ�ȭ�� ����)
		
//		int engTest[] = new int[] {10, 20, 30, 40, 50};
		int engTest[] = {10, 20, 30, 40, 50}; // ����� �ʱ�ȭ�� �Ѳ����� �Ѵ�.
		
		System.out.println(engTest[1]);
		
		int engTest2[] = engTest;
		System.out.println(engTest2.equals(engTest));
		
		System.out.println(engTest);
		System.out.println(engTest2);
		
		System.out.println("=============================");
		
		// jpTest 5�� �л� 50 ~ 90
		int jpTest[] = {50,60,70,80,90};
		
		// �迭���� ���
		System.out.println(jpTest.length);
		
		int a = 0;
		
		// ��ü ��� ����ؼ� ���
		for (int i = 0; i < jpTest.length; i++) {
			a += jpTest[i];
		}
		System.out.println("������ " + a);
		
		int avg = a / jpTest.length;
//		int avg = ((jpTest[0] + jpTest[1] + jpTest[2] + jpTest[3] + jpTest[4])/jpTest.length);
		System.out.println("����� " + avg);
		
		System.out.println("=============================");
		
		int count = 0;
		float Avgs = 0f;
		
		for (int i = 0; i < jpTest.length; i++) {
			count += jpTest[i];
		}
		
		Avgs = count / jpTest.length;
		
		System.out.println("���� : " + count);
		System.out.println("��� : " + Avgs);
		
		System.out.println("=============================");
		
		// ���η� �� ����ϱ�
		System.out.println(Arrays.toString(jpTest));
		
		System.out.println("=============================");
		
		// foreach(�迭) : ���� ������ ����, ���������� ��� �����.
		for (int i : jpTest) {
			System.out.println(i);
		}
		
		System.out.println("=============================");
		
		// engScore 2��° ����
		System.out.println(engScore[1]);
		
		// �װ��� ����(ũ��)
		System.out.println(engScore.length);
		
		// for������ �ϳ��� ���
		for (int i = 0; i < engScore.length; i++) {
			System.out.println(engScore[i]);
		}
		
		// foreach�� �ϳ��� ���
		for (int i : engScore) {
			System.out.println(i);
		}
		
		System.out.println("=============================");
		
		// �л� 3���� �̸��� ����
		String[] names = {"���ؼ�", "��ָ�", "�̸���"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println("=============================");
		
		int[] push = new int[5]; // 5ĭ ¥�� �ν��Ͻ� ���� 
		
		int sum = 0;
		
		for (int i = 0; i < push.length; i++) {
			push[i] = i+1;
			sum += push[i];
			System.out.print(sum + ",");
		}
		System.out.println(sum);
		
		System.out.println("=============================");
		
		int jpTestSum = 0;
		int jpTestAvg = 0;
		for (int i : jpTest) {
			jpTestSum += i;
		}
		jpTestAvg = jpTestSum / jpTest.length;
		System.out.println("��� �� : " + jpTestAvg);
		
	}
}
