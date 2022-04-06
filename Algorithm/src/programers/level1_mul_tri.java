package programers;

// 최대공약수와 최소공배수

public class level1_mul_tri {
    public int[] solution(int n, int m) {
        int tri = 0; // 최대공약수
        int mul = 0; // 최소공배수
        
        int i = 1;
        
        while (i <= n && i <= m) {
            if (n % i == 0 && m % i == 0) { // 0으로 떨어지면
                tri = i; // 최대공약수에 i값을 대입한다
            }
            i++; // i값 증가시켜 최대공약수 값 찾기
        }
        
        mul = (n*m) / tri;
        
        int[] answer = {tri, mul};
        return answer;
    }
}
