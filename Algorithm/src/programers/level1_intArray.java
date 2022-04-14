package programers;

// ������ �������� ���� �迭

// array�� �� element �� divisor�� ������ �������� ���� 
// ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
// divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.

import java.util.*;

public class level1_intArray {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> al = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                al.add(arr[i]);
            }
        }
        
        if (al.size() == 0) {
            al.add(-1);
        }
        
        int[] answer = al.stream().mapToInt(i -> i).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}
