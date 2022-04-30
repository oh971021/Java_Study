package programers;

// ���� ���ϱ�

// �������� ������ ���ʴ�� ���� ���� �迭 absolutes�� 
// �� �������� ��ȣ�� ���ʴ�� ���� �Ҹ��� �迭 signs�� �Ű������� �־����ϴ�. 
// ���� �������� ���� ���Ͽ� return �ϵ��� solution �Լ��� �ϼ����ּ���.

public class level1_addPositiveNegative {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            absolutes[i] *= signs[i] ? 1 : -1;
        } // true , false �� ���� ��/�� ���ϱ�
        
        for (int i : absolutes) {
            answer += i;
        } // ������ ���� ����
        
        return answer;
    }
}
