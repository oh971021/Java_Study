package programers;

// ���ڼ��ڼ��ڼ��ڼ��ڼ�?

// ���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
// ������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.

public class level1_suBak {
    public String solution(int n) {
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += i % 2 != 0 ? "��" : "��";
        }
        return answer;
    }
}
