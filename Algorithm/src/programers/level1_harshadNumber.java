package programers;

// �ϻ��� �� ã��

import java.util.Arrays;

public class level1_harshadNumber {
    public boolean solution(int x) {
        
        String str = Integer.toString(x); // String ��ȯ
        char[] ca = str.toCharArray(); // char[] ��ȯ (���� ���� ���)
        int[] ia = new int[ca.length];
        
        for (int i = 0; i < ia.length; i++) {
            ia[i] = (ca[i] - '0');
            System.out.println(ia[i]);
        } // int[] �� char[] ���
        
        int result = 0;
        
        for (int i =0; i < ia.length; i++) {
            result = Arrays.stream(ia).sum();
        } // �ϻ��� �� ��� ��
        
        boolean answer = false;
        
        if (x % result == 0) {
            answer = true;
        } // �������� answer == true �� ����
        
        return answer;
    }
}
