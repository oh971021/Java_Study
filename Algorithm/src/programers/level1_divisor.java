package programers;

// ����� ��

// ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.

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
 - ��︸�� �ٸ���� Ǯ��
 
 public int sumDivisor(int num) {
    int answer = 0;
    for(int i = 1; i <= num/2; i++){
    	if(num%i == 0) answer += i;
    }
    return answer+num;
}
 
*/
