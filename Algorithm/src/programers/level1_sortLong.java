package programers;

// ���� ������������ ��ġ�ϱ�
// �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
// n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
// ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.

import java.util.*;

public class level1_sortLong {
    public long solution(long n) { 
        String str = Long.toString(n);   
        String[] strArray = new String[str.length()];
        // ���� ��ġ�� ���� �迭��ü ����
        
        for (int i = 0; i < str.length(); i++) {
            strArray[i] = String.valueOf(str.charAt(i));
        } // �迭�� �� ���� ����
        str = ""; // ���� �� ���� ����ֱ�
        Arrays.sort(strArray, Collections.reverseOrder());
        // ���ڿ� ��������
        for (String s : strArray) {
            str += s; // �������� �� �� ���ҵ� str ������ ����
        }
        
        return Long.parseLong(str); // ���� ���� �°� String to Long �Ľ�
    }
}
