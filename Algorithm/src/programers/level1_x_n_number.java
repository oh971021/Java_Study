package programers;

// x��ŭ ������ �ִ� n���� ����

public class level1_x_n_number {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // ũ��� n��
        
        for (int i = 1; i <= n; i++) {
            answer[i-1] = (long)x*i;
        }
        
        return answer;
    }
}
