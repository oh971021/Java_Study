package programers;

import java.util.*;

public class level1_findKim {
    public String solution(String[] seoul) {
        return "�輭���� "+ Arrays.asList(seoul).indexOf("Kim") +"�� �ִ�"; // api ���
    }
    
    /*
     - Ǯ� �ذ�
     
    public String solution(String[] seoul) {
        int x = 0;
        
        for (int i=0; i<=seoul.length; i++) {
            if (seoul[i].equals("Kim")) { // �迭 �� Kim �� ���� ��, �ش� �ε��� ���� x�� ����
                x = i;
                break;
            }
        }
        
        return "�輭���� "+ x +"�� �ִ�";
    }
    */
}
