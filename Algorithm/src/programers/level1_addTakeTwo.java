package programers;

// �� �� �̾Ƽ� ���ϱ�

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        
        Arrays.sort(numbers);
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList�� ��갪�� ����
        
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = 1; j <= numbers.length -1; j++) {
                if (i != numbers.length-1) {
                    if (i != j) {
                        list.add(numbers[i] + numbers[j]); 
                        // �ش� ����(i) �� ��� ���ҵ�(j)�� ������
                    }    
                } else {
                    break;
                    // ������ ���� �����������
                }   
            }
        }
        
        HashSet<Integer> listData = new HashSet<Integer>(list);
        list = new ArrayList<Integer>(listData); // �ߺ��� ó��
        
        int[] answer = new int[list.size()]; // ���� �� ���� 
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).intValue();
            System.out.println(answer[i]);
        } // ArrayList ���� �⺻ �迭�� ���� 
        
        return answer;
    }
}