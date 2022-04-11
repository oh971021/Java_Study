package programers;

// ���� ���� �� �����ϱ�

// ������ ������ �迭, arr ���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. 
// ��, �����Ϸ��� �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. 
// ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� ���� �ϰ�, [10]�� [-1]�� ���� �մϴ�.

import java.util.*;

public class level1_removeSmallestNumber {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int min = 0;
        
        if (len != 0) {
            min = arr[0];
        }
        
        for (int i=1; i<len; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        } // �ּҰ� ã��

        List<Integer> al = new ArrayList<>(len);
        
        for (int i : arr) {
            al.add(i);
        } // int[] to ArrayList
        
        while(al.remove(Integer.valueOf(min))) { } // �ּҰ� �����ϱ�
        
        if (al.size() < 1) {
            al.add(-1);
        } // �� �迭���� -1 ���Խ�Ű��
        
        int[] answer = new int[al.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i).intValue();
        } // ArrayList to int[]
        
        return answer;
    }
}
