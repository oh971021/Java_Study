import java.util.Random;

// ¦���� �������ڸ� �̾��ִ� �ڽ�

// ����Ŭ������ ��ӹ��� �ڽ�Ŭ���������� ����Ŭ������ �Ӽ��� ����� ��� ����� �� �ִ�.
public class Box extends Random {
	
	// �������̵�(������)�� �����ϴ�.	
	@Override
	public int nextInt(int value) {
		int temp = super.nextInt(value);
		if (temp % 2 == 0) {
			return temp;
		}
		
		// ���ȣ��
		return nextInt(value);
	}
}
