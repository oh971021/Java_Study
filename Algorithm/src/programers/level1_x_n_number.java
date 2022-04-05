package programers;

// x만큼 간격이 있는 n개의 숫자

public class level1_x_n_number {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // 크기는 n개
        
        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long)x*i;
        }
        
        return answer;
    }
}
