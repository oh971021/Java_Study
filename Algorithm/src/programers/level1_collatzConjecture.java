package programers;

// �ݶ��� ����

public class level1_collatzConjecture {
    public int solution(int n) {
        int cnt = 0;
        
        long num = (long)n; // int �����÷ο� ����
        
        while (true) {
            if (num == 1) {
                break;
            } // 1�϶��� ��� ����
            
            if(num % 2 == 0) {
                num = num/2;
            } else {
                num = num * 3 + 1;
            } // ¦���� 2�� ���� / Ȧ���� 3�� ���ϰ� 1�� ���Ѵ�.
            
            cnt += 1; // ����� ó���Ǹ� cnt �� �ø�
            
            if (num == 1) {
                break;
            } // ������� 1���� ���Ǹ� Ż��
            
            if (cnt >= 500) {
                cnt = -1;
                break;
            } // 500���� �ݺ��ص� 1�� �ȵǸ� -1�� ��ȯ
        }     
        
        System.out.print(cnt);
        
        return cnt;
    }
}
