package programers;

// �������� 1�� �Ǵ� �� ã��

// �ڿ��� n�� �Ű������� �־����ϴ�. n�� x�� ���� �������� 1�� �ǵ��� �ϴ� 
// ���� ���� �ڿ��� x�� return �ϵ��� solution �Լ��� �ϼ����ּ���.

// ���� �׻� �������� ����� �� �ֽ��ϴ�.

import java.util.*;

public class level1_findOne {
    public int solution(int n) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int answer = 0;
        
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                al.add(i);
            }
        }
        
        int[] intArr = al.stream().mapToInt(i -> i).toArray();
        
        return intArr[0]; 
    }
}
