package programers;

// 3���� ������

// �ڿ��� n�� �Ű������� �־����ϴ�. n�� 3���� �󿡼� �յڷ� ������ ��, 
// �̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

import java.util.*;

public class level1_10to3to10 {
    public int solution(int n) {
        ArrayList<Integer> sam = new ArrayList<Integer>();
        String result = "";
 
        while (n > 0) {
            sam.add(n % 3);
            n /= 3;   
        }
         
        for (int i = 0; i < sam.size(); i++) {
            result += ""+sam.get(i);
        }
        
        return Integer.parseInt(result, 3);
    }
}
