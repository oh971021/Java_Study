package programers;

// �Ҽ� ã��

// 1���� �Է¹��� ���� n ���̿� �ִ� �Ҽ��� ������ ��ȯ�ϴ� �Լ�, solution�� ����� ������.
// �Ҽ��� 1�� �ڱ� �ڽ����θ� ���������� ���� �ǹ��մϴ�.
// (1�� �Ҽ��� �ƴմϴ�.)

public class level1_findSqrt {
    public int solution(int n) {
        int cnt = 0;

        for (int i = 2; i <= n; i++) {
            boolean ok = true; // �ʱ� ��
            for (int j = 2; j*j <= i; j++) {
                if(i % j == 0) { // i ���� ������ ���������� �Ҽ��� �ƴ�
                    ok = false; // �׶��� false�� ��ȯ
                    break;
                }
            }
            if(ok) { // �Ҽ����̶�� �Ǵܵ� �͸� cnt++
                cnt++;
            }
        }
        
        return cnt;
    }
}
