package programers;

// 정수 제곱근 판별

// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

import java.lang.Math;

public class level1_sqrt {
    public long solution(long n) {
        long answer = -1;
        
        long result = (long)Math.sqrt(n);
        
        if (Math.pow(result, 2) == n) {
            answer = (long)Math.pow(result+1,2);
        }
        
        return answer;
    }
}
