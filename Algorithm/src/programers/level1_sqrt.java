package programers;

// ���� ������ �Ǻ�

// ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
// n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.

import java.lang.Math;

public class level1_sqrt {
    public long solution(long n) {
        long answer = -1;
        
        long result = (long)Math.sqrt(n);
        
        if (Math.pow(result, 2) == n) {
            answer = (long)Math.pow(result+1,2);
        }
        
        return answer;
    }
}
