package programers;

// 약수의 합

// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.

public class level1_divisor {
    public int solution(int n) {
        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result += i;
            }
        }
        
        return result;
    }
}

/*
 - 배울만한 다른사람 풀이
 
 public int sumDivisor(int num) {
    int answer = 0;
    for(int i = 1; i <= num/2; i++){
    	if(num%i == 0) answer += i;
    }
    return answer+num;
}
 
*/
