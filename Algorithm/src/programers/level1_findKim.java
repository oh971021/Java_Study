package programers;

import java.util.*;

public class level1_findKim {
    public String solution(String[] seoul) {
        return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim") +"에 있다"; // api 사용
    }
    
    /*
     - 풀어서 해결
     
    public String solution(String[] seoul) {
        int x = 0;
        
        for (int i=0; i<=seoul.length; i++) {
            if (seoul[i].equals("Kim")) { // 배열 중 Kim 과 같을 때, 해당 인덱스 값을 x에 대입
                x = i;
                break;
            }
        }
        
        return "김서방은 "+ x +"에 있다";
    }
    */
}
