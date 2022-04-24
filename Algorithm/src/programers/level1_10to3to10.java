package programers;

// 3진법 뒤집기

// 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 
// 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

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
