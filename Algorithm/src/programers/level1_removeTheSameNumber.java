package programers;

// ���� ���ڴ� �Ⱦ�

// �迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. 
// �̶�, �迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
// ��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. 

// ���� ���,
// arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
// arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
// �迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.

import java.util.*;

public class level1_removeTheSameNumber {
    public int[] solution(int []arr) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int x = 10; // 0 ~ 9 �� ���ڰ� ������ ������ �񱳺����� �� ������ 0 > x > 9 �� �ʱ�ȭ�Ѵ�.
        
        for (int i = 0; i < arr.length; i++) {
            if(x != arr[i]) { // ���� �� �񱳺����� ���� �ش� �ε��� ������ ���� ���� �ƴ� ��� �迭 �߰�
                al.add(arr[i]);    
            }
            x = arr[i]; // ���� �� �񱳺��� �ʱ�ȭ
        }
        
        int[] answer = new int[al.size()]; // ArrayList to int[]
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = al.get(i).intValue(); 
        }
        
        return answer;
    }
}
