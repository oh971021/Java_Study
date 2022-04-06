package programers;

// 콜라츠 추측

public class level1_collatzConjecture {
    public int solution(int n) {
        int cnt = 0;
        
        long num = (long)n; // int 오버플로우 방지
        
        while (true) {
            if (num == 1) {
                break;
            } // 1일때는 계산 안함
            
            if(num % 2 == 0) {
                num = num/2;
            } else {
                num = num * 3 + 1;
            } // 짝수는 2로 나눔 / 홀수는 3을 곱하고 1을 더한다.
            
            cnt += 1; // 계산이 처리되면 cnt 를 올림
            
            if (num == 1) {
                break;
            } // 결과값이 1까지 계산되면 탈출
            
            if (cnt >= 500) {
                cnt = -1;
                break;
            } // 500번을 반복해도 1이 안되면 -1을 반환
        }     
        
        System.out.print(cnt);
        
        return cnt;
    }
}
