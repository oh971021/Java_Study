package programers;

// ���� ���� ���ϱ�

// 0���� 9������ ���� �� �Ϻΰ� ����ִ� ���� �迭 numbers�� �Ű������� �־����ϴ�.
// numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� return �ϵ���
// solution �Լ��� �ϼ����ּ���.

public class level1_addNumbers {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int n : numbers) {
            answer += n;
        }
        
        return 45 - answer;
    }
}
