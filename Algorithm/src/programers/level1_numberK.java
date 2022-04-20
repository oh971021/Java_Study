package programers;

// K��° ��

// �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

// ���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
// array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
// 1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
// 2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.

// �迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, 
// commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� 
// return �ϵ��� solution �Լ��� �ۼ����ּ���.a

import java.util.*;

public class level1_numberK {
    public int[] solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for (int i = 0; i < commands.length; i++) {
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int j = 0; j < commands[i].length; j++) {
                al.add(commands[i][j]); // int[] to ArrayList
            }
            int[] array1 = Arrays.copyOfRange(array, al.get(0).intValue()-1, al.get(1).intValue()); // �ε��� �ڸ���
            Arrays.sort(array1); // �������� ����
            answer.add(array1[al.get(2).intValue()-1]); // �ش� �ε��� �� ���� �� List add
        }
        
        int[] answer1 = new int[answer.size()]; // ArrayList to int[]
        
        for (int i = 0; i < answer1.length; i++) {
            answer1[i] = answer.get(i).intValue();  
        }
        
        return answer1;
    }
}
